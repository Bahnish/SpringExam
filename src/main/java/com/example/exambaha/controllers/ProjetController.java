package com.example.exambaha.controllers;

import com.example.exambaha.entities.Projet;
import com.example.exambaha.entities.User;
import com.example.exambaha.services.IProjetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Projet")
public class ProjetController {

    @Autowired
    private IProjetServices iProjetServices;

    @PostMapping("/addUProjet")
    public Projet addProject(@RequestBody Projet projet){
        return iProjetServices.addProject(projet);
    }
}
