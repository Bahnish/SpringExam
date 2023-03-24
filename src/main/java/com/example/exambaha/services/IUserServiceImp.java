package com.example.exambaha.services;

import com.example.exambaha.entities.User;
import com.example.exambaha.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImp implements IUserServices {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {

        return userRepository.save(user);
    }
}
