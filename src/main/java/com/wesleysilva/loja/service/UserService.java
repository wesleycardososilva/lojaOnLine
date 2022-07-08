package com.wesleysilva.loja.service;


import com.wesleysilva.loja.entity.User;
import com.wesleysilva.loja.model.UserModel;

public interface UserService {
    public User saveUser(User user);

    User registerUser(UserModel userModel);
}
