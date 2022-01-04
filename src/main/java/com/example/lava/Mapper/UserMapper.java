package com.example.lava.Mapper;

import com.example.lava.Bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUser(int id);
}
