package com.example.lava.controller;

import com.example.lava.domain.Department;
import com.example.lava.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping(value = "/department")
    public List<Department> getDepartment(){
        return departmentService.getDepartment();
    }
}
