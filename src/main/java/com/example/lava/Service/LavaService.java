package com.example.lava.Service;

import com.example.lava.Bean.Administrator;
import com.example.lava.Bean.Instructor;
import com.example.lava.Bean.Student;
import com.example.lava.Bean.User;
import com.example.lava.Mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class LavaService {

    final UserMapper userMapper;

    public LavaService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUser(int id, String password){
        User user=userMapper.getUser(id);
        if(user.getPassword().equals(password)){
            return user;
        }
        else {
            return new User();
        }
    }

    public int addAdministrator(Administrator administrator){
        userMapper.addUser(administrator);
        userMapper.addAdministrator(administrator.getId());
        return administrator.getId();
    }

    public int addStudent(Student student){
        userMapper.addUser(student);
        userMapper.addStudent(student.getId(),student.getProgram());
        return student.getId();
    }

    public int addInstructor(Instructor instructor){
        userMapper.addUser(instructor);
        userMapper.addInstructor(instructor.getId(),instructor.getDepartment_id(),instructor.getPosition());
        return instructor.getId();
    }
}
