package com.example.lava.service;

import com.example.lava.domain.Administrator;
import com.example.lava.domain.Instructor;
import com.example.lava.domain.Student;
import com.example.lava.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<Instructor> getInstructor(int id){
        return userMapper.getInstructor(id);
    }

    public int addAdministrator(Administrator administrator){
        userMapper.addUser(administrator);
        userMapper.addAdministrator(administrator.getId());
        return administrator.getId();
    }

    public int addStudent(Student student){
        userMapper.addUser(student);
        userMapper.addStudent(student.getId());
        return student.getId();
    }

    public int addInstructor(Instructor instructor){
        userMapper.addUser(instructor);
        userMapper.addInstructor(instructor.getId(),instructor.getDepartmentId(),instructor.getPosition());
        return instructor.getId();
    }
}
