package com.example.lava.mapper;

import com.example.lava.domain.StudentProgram;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentProgramMapper {
    @Insert("insert into student_program values(#{studentId},#{programId})")
    void addStudentProgram(StudentProgram studentProgram);
}
