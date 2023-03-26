package com.example.exambaha.controllers;

import com.example.exambaha.entities.User;
import com.example.exambaha.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("User")
public class UserController {

    @Autowired
    private IUserServices iUserServices;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return iUserServices.addUser(user);
    }

    @PostMapping("/{projectId}/{userId}")
    public void assignProjetToUser (@PathVariable int projetId, @PathVariable int userId){
        iUserServices.assignProjetToUser(projetId,userId);
    };
    @PostMapping("/{projectId}")
    public void assignProjetToClient(@PathVariable int projectId, @RequestBody String fiName, @RequestBody String lName) {
        iUserServices.assignProjetToClient(projectId,fiName,lName);};
}
