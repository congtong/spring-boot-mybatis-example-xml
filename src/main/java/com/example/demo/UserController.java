package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tc
 * @createTime 08 15:54
 * @description
 */
@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/get")
    public List<User> getList() {
        return userMapper.getList();
    }
}
