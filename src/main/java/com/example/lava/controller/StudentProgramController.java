package com.example.lava.controller;

import com.example.lava.domain.StudentProgram;
import com.example.lava.service.StudentProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentProgramController {

    @Autowired
    StudentProgramService studentProgramService;

    @PostMapping(value = "/student_program")
    public void addStudentProgram(@RequestBody StudentProgram studentProgram){
        studentProgramService.addStudentProgram(studentProgram);
    }
}
