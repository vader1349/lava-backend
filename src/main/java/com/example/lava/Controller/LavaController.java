package com.example.lava.Controller;

import com.example.lava.Bean.*;
import com.example.lava.Service.LavaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/instructor/{department_id}")
    public List<Instructor> getInstructor(@PathVariable("department_id")int id){
        return lavaService.getInstructor(id);
    }

    @GetMapping(value = "/program")
    public List<Program> getProgram(){
        return lavaService.getProgram();
    }

    @GetMapping(value = "/department")
    public List<Department> getDepartment(){
        return lavaService.getDepartment();
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

    @PostMapping(value = "/student_program")
    public void addStudentProgram(@RequestBody StudentProgram studentProgram){
        lavaService.addStudentProgram(studentProgram);
    }

    @PostMapping(value = "/course")
    public int addCourse(@RequestBody Course course){
        return lavaService.addCourse(course);
    }
}
