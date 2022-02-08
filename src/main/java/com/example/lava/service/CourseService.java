package com.example.lava.service;

import com.example.lava.domain.*;
import com.example.lava.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    public int addCourse(Course course){
        courseMapper.addCourse(course);
        return course.getCourseId();
    }
}
