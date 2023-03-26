package com.example.exambaha.services;

import com.example.exambaha.entities.Projet;

import javax.transaction.Transactional;
import java.util.List;

public interface IProjetServices {

    Projet addProjet (Projet project);
    public List<Projet> getAllCurrentProjet() ;
    public List<Projet> getProjetsByScrumMaster(String fName, String lName);
}
