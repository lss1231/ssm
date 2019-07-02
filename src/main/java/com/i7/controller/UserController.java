package com.i7.controller;

import com.i7.entity.User;
import com.i7.service.ServiceIml.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/getUserById")
    public User getUserById(int id) {
        return userService.getUserById(id);
    }
}
