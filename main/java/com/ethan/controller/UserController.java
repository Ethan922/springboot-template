package com.ethan.controller;

import com.ethan.model.entity.User;
import com.ethan.model.result.Result;
import com.ethan.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public Result<User> getUser(@PathVariable Integer id){
        User user = userService.getById(id);
        return Result.success(user);
    }


}
