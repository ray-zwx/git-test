package com.ray.controller;

import com.ray.domain.User;

import com.ray.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class MyBatisController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/quick")
    @ResponseBody
    public List<User> queryUserList(){
        List<User> users=userMapper.queryUserList();
        return users;
    }
}
