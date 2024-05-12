package com.example.springmultipleprofiledemo.controller;

import com.example.springmultipleprofiledemo.entity.User;
import com.example.springmultipleprofiledemo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userrepository;

    @GetMapping("/getallusers")
    public List<User> getAllUsers(){

        return userrepository.findAll();
    }

    @GetMapping("/insertuser")
    public void insertuser(@RequestBody User user){

        userrepository.save(user);
    }
}
