package com.jddc.rental_api.controller;


import com.jddc.rental_api.model.User;
import com.jddc.rental_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired UserService userService;
    @GetMapping("/test")
    public String testApi(){
        return userService.testService();
    }

    @GetMapping("/save")
    public User testApi(@RequestBody User user){
        return userService.saveUser(user);
    }

}