package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.model.UserModel;

import java.util.List;

/**
 * @author: ZhangJiaqian
 * @createtime: 2018-08-13 16:11
 * @description: ${description}
 */
public interface UserService {
    public List<User> selectAllUser();
    public User selectUserByUserId(Integer userId);
}
