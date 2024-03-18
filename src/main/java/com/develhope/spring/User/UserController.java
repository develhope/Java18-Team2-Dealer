package com.develhope.spring.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/newUser")
    public User newUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("/getAll")
    public List <User> getAllUser(){
        return userService.getAllUsers();
    }
}
