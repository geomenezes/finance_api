package com.project.finance_api.controllers;

import com.project.finance_api.dto.LoginDto;
import com.project.finance_api.dto.RegisterDto;
import com.project.finance_api.entities.UserEntity;
import com.project.finance_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    //private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(
           // @RequestBody LoginDto loginDto
    ){

        return new ResponseEntity<>("Logado!", HttpStatus.OK);
    }

//    @PostMapping("/register")
//    public ResponseEntity<?> registerUser(@RequestBody RegisterDto signUpDto){
//
//        // add check for username exists in a DB
//        if(userRepository.existsByUsername(signUpDto.getUsername())){
//            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
//        }
//
//        // add check for email exists in DB
//        if(userRepository.existsByEmail(signUpDto.getEmail())){
//            return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
//        }
//
//        // create user object
//        UserEntity user = new UserEntity();
//        user.setNome(signUpDto.getNome());
//        user.setEmail(signUpDto.getEmail());
//        user.setSenha(signUpDto.getSenha());
//
//        userRepository.save(user);
//
//        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
//
//    }
}
