package com.example.exambaha.services;

import com.example.exambaha.controllers.ProjetController;
import com.example.exambaha.entities.Projet;
import com.example.exambaha.entities.Sprint;
import com.example.exambaha.entities.User;
import com.example.exambaha.repositories.ProjetRepository;
import com.example.exambaha.repositories.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class IProjetServiceImp implements IProjetServices {
    @Autowired
    private ProjetRepository projetRepository;
    @Autowired
    private SprintRepository sprintRepository;

    @Transactional
    @Override
    public Projet addProject(Projet projet) {
        if (projet.getSprintList()!=null) {

            projetRepository.saveAndFlush(projet);
            projet.getSprintList().forEach(sprint -> {
                sprint.setProjets(projet);
            });

        }
        return projet;


        // for (Sprint s: projet.getSprintList()){
        // Sprint se = sprintRepository.saveAndFlush(s);
        //se.setProjets(projet);

        //
        //return projetRepository.saveAndFlush(projet);//

    }
}
