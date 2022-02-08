package com.example.lava.mapper;

import com.example.lava.domain.Instructor;
import com.example.lava.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from sys_user where id = #{id}")
    User getUser(@Param("id") int id);

    @Select("select * from instructor i left join sys_user s on i.instructor_id=s.id where department_id = #{id}")
    List<Instructor> getInstructor(@Param("id")int id);

    @Insert("insert into sys_user values(null,#{name},#{password},#{type},#{email})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addUser(User user);

    @Insert("insert into administrator values(#{id})")
    void addAdministrator(@Param("id")int id);

    @Insert("insert into instructor values(#{instructorId},#{departmentId},#{position})")
    void addInstructor(@Param("instructorId")int instructorId,@Param("departmentId")int departmentId,@Param("position")char position);

    @Insert("insert into student values(#{id})")
    void addStudent(@Param("id")int id);
}
