package com.example.restservice.controller;

import com.example.restservice.entity.User;
import com.example.restservice.entity.UserDao;
import com.example.restservice.entity.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDao userDao;

    @GetMapping("/increaseAndGetAge")
    public User getAgeByUserId(int userId) {
        userMapper.increaseAge(userId);
        return userMapper.getAgeByUserIdForUpdate(userId);
    }
    @GetMapping("/findById")
    public User getByUserId(Integer userId) {
        return userDao.findByUserId(userId);
    }

}
