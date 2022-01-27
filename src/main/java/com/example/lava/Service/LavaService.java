package com.example.lava.Service;

import com.example.lava.Bean.*;
import com.example.lava.Mapper.DepartmentMapper;
import com.example.lava.Mapper.ProgramMapper;
import com.example.lava.Mapper.StudentProgramMapper;
import com.example.lava.Mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LavaService {

    final UserMapper userMapper;
    final DepartmentMapper departmentMapper;
    final ProgramMapper programMapper;
    final StudentProgramMapper studentProgramMapper;

    public LavaService(UserMapper userMapper,DepartmentMapper departmentMapper,ProgramMapper programMapper,StudentProgramMapper studentProgramMapper) {
        this.userMapper = userMapper;
        this.departmentMapper=departmentMapper;
        this.programMapper=programMapper;
        this.studentProgramMapper=studentProgramMapper;
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

    public List<Department> getDepartment(){
        return departmentMapper.getDepartment();
    }

    public List<Program> getProgram(){
        return programMapper.getProgram();
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

    public void addStudentProgram(StudentProgram studentProgram){
        studentProgramMapper.addStudentProgram(studentProgram);
    }
}
