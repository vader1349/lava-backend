package com.example.lava.mapper;

import com.example.lava.domain.Program;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProgramMapper {

    @Select("select * from program")
    List<Program> getProgram();

}
