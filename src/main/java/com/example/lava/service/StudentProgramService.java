package com.example.lava.service;

import com.example.lava.domain.StudentProgram;
import com.example.lava.mapper.StudentProgramMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentProgramService {

    @Autowired
    StudentProgramMapper studentProgramMapper;

    public void addStudentProgram(StudentProgram studentProgram){
        studentProgramMapper.addStudentProgram(studentProgram);
    }
}
