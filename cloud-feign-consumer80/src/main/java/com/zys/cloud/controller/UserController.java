package com.zys.cloud.controller;

import com.zys.cloud.entity.User;
import com.zys.cloud.service.UserClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class UserController {

    @Resource
    private UserClientService userClientService;

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") long id){
        return userClientService.getUser(id);
    }

    @PostMapping("/add")
    public int addUser(User user){
        return userClientService.addUser(user);
    }

}
