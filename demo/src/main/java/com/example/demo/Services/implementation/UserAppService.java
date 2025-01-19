package com.example.demo.Services.implementation;


import com.example.demo.entites.UserApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.UserAppRepository;

import java.util.*;


@Service
public class UserAppService {


    @Autowired
    private UserAppRepository userAppRepository;

    // Ajouter un utilisateur
    public UserApp addUserApp(UserApp userApp) {
        return userAppRepository.save(userApp);
    }

    // Trouver un utilisateur par email
    public UserApp findUserAppByEmail(String email) {
        return userAppRepository.findByEmail(email);
    }

    // Trouver tous les utilisateurs
    public List<UserApp> findAllUserApp() {
        return (List<UserApp>) userAppRepository.findAll();
    }
}
