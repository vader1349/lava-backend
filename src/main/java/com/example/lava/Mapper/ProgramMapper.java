package com.example.lava.Mapper;

import com.example.lava.Bean.Program;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProgramMapper {

    @Select("select * from program")
    List<Program> getProgram();

}
