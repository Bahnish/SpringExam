package com.example.exambaha.services;

import com.example.exambaha.entities.Projet;
import com.example.exambaha.entities.Role;
import com.example.exambaha.repositories.ProjetRepository;
import com.example.exambaha.repositories.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
public class IProjetServiceImp implements IProjetServices {

    @Autowired
    private ProjetRepository projetRepository;
    @Autowired
    private SprintRepository sprintRepository;

    @Transactional
    @Override
    public Projet addProjet(Projet projet) {
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
    @Transactional
    @Override
    public List<Projet> getAllCurrentProjet() {
        return projetRepository.findAllBySprintsStartdateGreaterThan(LocalDate.now());
    }

    @Override
    public List<Projet> getProjetsByScrumMaster(String fName, String lName) {
        return projetRepository.findAllByUserRoleAndUserFnameAndUserLname(Role.SCRUM_MASTER,fName,lName);
    }
}
