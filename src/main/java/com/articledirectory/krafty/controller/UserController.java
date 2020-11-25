package com.articledirectory.krafty.controller;

import com.articledirectory.krafty.model.User;
import com.articledirectory.krafty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST,value="/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @RequestMapping(method = RequestMethod.POST,value="/login")
    public User login(@RequestBody User user) {
        return userService.login(user);
    }
}