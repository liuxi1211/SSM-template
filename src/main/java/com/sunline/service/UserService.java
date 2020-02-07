package com.sunline.service;

import com.sunline.vo.User;

import java.util.List;

public interface UserService {
    List<User> findAll(String username);
}
