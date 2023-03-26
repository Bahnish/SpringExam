package com.example.exambaha.services;

import com.example.exambaha.entities.Projet;
import com.example.exambaha.entities.Sprint;
import com.example.exambaha.repositories.ProjetRepository;
import com.example.exambaha.repositories.SprintRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Service
public class ISprintServiceImp implements ISprintServices{
    ProjetRepository projetRepository;
    SprintRepository sprintRepository;
    @Override
    public void addSprintAndAssignToProjet(Sprint sprint, int idProject) {
        Projet project = projetRepository.findById(idProject).orElse(null);
        Assert.notNull(project, "Projet must not be null.") ;
        List<Sprint> sprints =new ArrayList<>();
        sprints.add(sprint);
        project.setSprintList(sprints);
        sprintRepository.saveAndFlush(sprint);
    }
}
