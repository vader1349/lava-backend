package com.example.lava.controller;

import com.example.lava.domain.*;
import com.example.lava.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping(value = "/course")
    public int addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
}
