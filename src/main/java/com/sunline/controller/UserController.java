package com.sunline.controller;

import com.sunline.service.UserService;
import com.sunline.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("find")
    @ResponseBody
    private List<User> findAll(String username) {
        List<User> users = userServiceImpl.findAll(username);
        return users;
    }

}
