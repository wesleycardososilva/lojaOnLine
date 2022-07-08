package com.wesleysilva.loja.controller;

import com.wesleysilva.loja.entity.User;
import com.wesleysilva.loja.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);

    }
}
