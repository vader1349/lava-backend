package com.example.lava.controller;

import com.example.lava.domain.Token;
import com.example.lava.domain.User;
import com.example.lava.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping(value = "/login")
    public Token login(@RequestBody User user){
        return loginService.login(user);
    }
}
