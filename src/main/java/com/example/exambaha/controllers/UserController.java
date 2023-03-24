package com.example.exambaha.controllers;

import com.example.exambaha.entities.User;
import com.example.exambaha.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("User")
public class UserController {

    @Autowired
    private IUserServices iUserServices;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return iUserServices.addUser(user);
    }
}
