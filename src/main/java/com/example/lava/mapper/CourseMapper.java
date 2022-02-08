package com.example.lava.mapper;

import com.example.lava.domain.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface CourseMapper {
    @Insert("insert into course values(null,#{instructorId},#{code},#{format})")
    @Options(useGeneratedKeys = true, keyProperty = "courseId")
    void addCourse(Course course);
}
