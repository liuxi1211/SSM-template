package com.sunline.service;

import com.sunline.dao.UserDao;
import com.sunline.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll(String username) {
        List<User> users = userDao.findAll(username);
        return users;
    }
}
