package com.example.lava.controller;

import com.example.lava.domain.Administrator;
import com.example.lava.domain.Instructor;
import com.example.lava.domain.Student;
import com.example.lava.domain.User;
import com.example.lava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/instructor/{department_id}")
    public List<Instructor> getInstructor(@PathVariable("department_id")int id){
        return userService.getInstructor(id);
    }


    @PostMapping(value = "/administrator")
    public int addAdministrator(@RequestBody Administrator administrator){
        return userService.addAdministrator(administrator);
    }

    @PostMapping(value = "/student")
    public int addStudent(@RequestBody Student student){
        return userService.addStudent(student);
    }

    @PostMapping(value = "/instructor")
    public int addInstructor(@RequestBody Instructor instructor){
        return userService.addInstructor(instructor);
    }
}
