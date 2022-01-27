package com.example.lava.Mapper;

import com.example.lava.Bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department")
    List<Department> getDepartment();
}
