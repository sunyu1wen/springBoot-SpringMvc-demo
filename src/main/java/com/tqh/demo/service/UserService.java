package com.tqh.demo.service;

import com.tqh.demo.mapper.UserMapper;
import com.tqh.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserService {
    @Autowired
    UserMapper userMapper;

    //    @Override
    public Person selectUser(int id) {
//        Person result = new Person();
//        result.setName("son");
//        result.setAge(12);
        return userMapper.selectUser(id);
    }

}