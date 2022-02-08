package com.example.lava.service;

import com.example.lava.domain.Department;
import com.example.lava.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getDepartment(){
        return departmentMapper.getDepartment();
    }
}
