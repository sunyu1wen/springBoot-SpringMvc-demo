package com.tqh.demo.controller;

import com.tqh.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class UserController {
    @Autowired
    private UserService userService;
//    @Autowired
//    public UserService userService2;

    @RequestMapping("/showUser/{id}")
    public String selectUser (@PathVariable Integer id){
        return  userService.selectUser(id).toString();
    }


}