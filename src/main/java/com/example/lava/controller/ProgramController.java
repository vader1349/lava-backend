package com.example.lava.controller;

import com.example.lava.domain.Program;
import com.example.lava.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramController {

    @Autowired
    ProgramService programService;

    @GetMapping(value = "/program")
    public List<Program> getProgram(){
        return programService.getProgram();
    }
}
