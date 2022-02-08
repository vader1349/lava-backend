package com.example.lava.service;

import com.example.lava.domain.Program;
import com.example.lava.mapper.ProgramMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {

    @Autowired
    ProgramMapper programMapper;

    public List<Program> getProgram(){
        return programMapper.getProgram();
    }
}
