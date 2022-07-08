package com.wesleysilva.loja.controller;

import com.wesleysilva.loja.entity.User;
import com.wesleysilva.loja.event.RegistrationCompleteEvent;
import com.wesleysilva.loja.model.UserModel;
import com.wesleysilva.loja.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){
        User user = userService.registerUser(userModel);
        publisher.publishEvent(new RegistrationCompleteEvent(
             user,
             "url"
        ));
        return "Success";
    }
}
