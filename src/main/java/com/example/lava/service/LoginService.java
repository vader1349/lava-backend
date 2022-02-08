package com.example.lava.service;

import com.example.lava.domain.LoginUser;
import com.example.lava.domain.Token;
import com.example.lava.domain.User;
import com.example.lava.util.JwtUtil;
import com.example.lava.util.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginService {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    RedisCache redisCache;

    public Token login(User user){
        UsernamePasswordAuthenticationToken authenticationToken=new UsernamePasswordAuthenticationToken(user.getId(),user.getPassword());
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        if(Objects.isNull(authentication)){
            throw new RuntimeException("Login failed.");
        }
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        String id = loginUser.getUser().getId()+"";
        String jwt = JwtUtil.createJWT(id);
        redisCache.setCacheObject("login:"+id,loginUser);
        return new Token(jwt);
    }
}
