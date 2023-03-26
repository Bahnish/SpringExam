package com.example.exambaha.services;

import com.example.exambaha.entities.User;

public interface IUserServices {
     User addUser (User user);

     public void assignProjetToUser (int projetId, int userId);

     public void assignProjetToClient(int projetId, String fName, String lName);

}
