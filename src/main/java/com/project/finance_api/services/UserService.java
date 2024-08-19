package com.project.finance_api.services;

import com.project.finance_api.entities.User;
import com.project.finance_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }

}