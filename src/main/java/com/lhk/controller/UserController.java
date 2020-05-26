package com.lhk.controller;

import com.lhk.entity.User;
import com.lhk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    @ResponseBody
    public List<User> list(){
        System.out.println("sdfsdf");
        List<User> users = userService.selectAll();
        System.out.println(users.toString());
        return users;
    }
}
