package com.sunline.dao;

import com.sunline.vo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> findAll(@Param("username") String username);
}
