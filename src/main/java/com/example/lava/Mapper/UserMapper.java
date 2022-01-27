package com.example.lava.Mapper;

import com.example.lava.Bean.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from sys_user where id = #{id}")
    User getUser(@Param("id") int id);

    @Insert("insert into sys_user values(null,#{name},#{password},#{type},#{email})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addUser(User user);

    @Insert("insert into administrator values(#{id})")
    void addAdministrator(@Param("id")int id);

    @Insert("insert into instructor values(#{instructor_id},#{department_id},#{position})")
    void addInstructor(@Param("instructor_id")int instructorId,@Param("department_id")int departmentId,@Param("position")char position);

    @Insert("insert into student values(#{id})")
    void addStudent(@Param("id")int id);
}
