package com.example.lava.Controller;

import com.example.lava.Bean.User;
import com.example.lava.Service.LavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LavaController {

    @Autowired
    LavaService lavaService;

    @GetMapping(value = "/user/{id}/{password}")
    public User getUser(@PathVariable("id") int id,@PathVariable("password") String password){
        return lavaService.getUser(id,password);
    }
}
