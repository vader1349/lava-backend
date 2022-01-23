package com.example.lava.Controller;

import com.example.lava.Bean.Administrator;
import com.example.lava.Bean.Instructor;
import com.example.lava.Bean.Student;
import com.example.lava.Bean.User;
import com.example.lava.Service.LavaService;
import org.springframework.web.bind.annotation.*;

@RestController
public class LavaController {

    final LavaService lavaService;

    public LavaController(LavaService lavaService) {
        this.lavaService = lavaService;
    }

    @GetMapping(value = "/user/{id}/{password}")
    public User getUser(@PathVariable("id") int id,@PathVariable("password") String password){
        return lavaService.getUser(id,password);
    }

    @PostMapping(value = "/administrator")
    public int addAdministrator(@RequestBody Administrator administrator){
        return lavaService.addAdministrator(administrator);
    }

    @PostMapping(value = "/student")
    public int addStudent(@RequestBody Student student){
        return lavaService.addStudent(student);
    }

    @PostMapping(value = "/instructor")
    public int addInstructor(@RequestBody Instructor instructor){
        return lavaService.addInstructor(instructor);
    }
}
