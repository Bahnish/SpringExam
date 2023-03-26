package com.example.exambaha.controllers;

import com.example.exambaha.entities.Projet;
import com.example.exambaha.entities.User;
import com.example.exambaha.services.IProjetServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Projet")
@RequiredArgsConstructor
public class ProjetController {
    private  final  IProjetServices iProjetServices;
    @PostMapping("/ADD")
    public Projet addProject (Projet projet)
    {return iProjetServices.addProjet(projet);};
    @GetMapping("/ALLProjet")
    public List<Projet> getAllCurrentProjet(){
        return iProjetServices.getAllCurrentProjet();
    } ;
    @GetMapping("/PjWithScrum")
    public List<Projet> getProjetsByScrumMaster(@RequestBody String fName, @RequestBody String lName){
        return iProjetServices.getProjetsByScrumMaster(fName,lName);
    }
}
