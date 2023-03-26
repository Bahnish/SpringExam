package com.example.exambaha.services;

import com.example.exambaha.entities.Projet;
import com.example.exambaha.entities.User;
import com.example.exambaha.repositories.ProjetRepository;
import com.example.exambaha.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class IUserServiceImp implements IUserServices {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjetRepository projetRepository;

    @Override
    public User addUser(User user) {

        return userRepository.save(user);
    }
    @Override
    @Transactional
    public void assignProjetToUser(int projetId, int userId) {
        Projet projet = projetRepository.findById(projetId).orElse(null);
        User user = userRepository.findById(userId).orElse(null);
        if ((projet!=null) && (user!=null)) {
            List<Projet> listprojets=new ArrayList<>();
            listprojets.add(projet);
            user.setProjets(listprojets);
            userRepository.saveAndFlush(user);
        }

    }

    @Override
    @Transactional
    public void assignProjetToClient(int projetId, String fiName, String lName) {
        Projet projet = projetRepository.findById(projetId).orElse(null);
        String fName;
        User user = userRepository.findByFnameAndLname(fiName,lName);
        if ((projet!=null) && (user!=null)) {
            List<Projet> projetList = new ArrayList<>();
            projetList.add(projet);
            user.setProjets(projetList);
            userRepository.saveAndFlush(user);

        }





    }

}
