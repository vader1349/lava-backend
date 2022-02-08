package com.example.lava.service;

import com.example.lava.domain.LoginUser;
import com.example.lava.domain.User;
import com.example.lava.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserDetailServiceImp implements UserDetailsService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userMapper.getUser(Integer.parseInt(username));
        if(Objects.isNull(user)){
            throw new RuntimeException("Wrong user ID or password.");
        }
        return new LoginUser(user);
    }
}
