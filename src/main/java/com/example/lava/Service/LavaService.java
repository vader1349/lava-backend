package com.example.lava.Service;

import com.example.lava.Bean.User;
import com.example.lava.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LavaService {

    @Autowired
    UserMapper userMapper;

    public User getUser(int id, String password){
        User user=userMapper.getUser(id);
        if(user.getPassword().equals(password)){
            return user;
        }
        else {
            return new User();
        }
    }
}
