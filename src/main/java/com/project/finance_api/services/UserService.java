package com.project.finance_api.services;

import com.project.finance_api.entities.UserEntity;
import com.project.finance_api.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getUser() {
        return userRepository.findAll();
    }

    public UserEntity getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }
    public UserEntity updateUser(Long id, UserEntity user) {
        user.setId(id);
        return userRepository.save(user);
    }
//    public void deleteUser(Long id) {
//        userRepository.deleteById(id);
//    }

}