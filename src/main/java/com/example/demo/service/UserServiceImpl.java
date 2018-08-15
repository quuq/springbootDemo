package com.example.demo.service;/**
 * @author: ZhangJiaqian
 * @createtime: 2018-08-13 16:13
 * @description: k
 */

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *@program: demo
 *
 *@description: k
 *
 *@author: ZhangJiaqian
 *
 *@createtime: 2018-08-13 16:13
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAllUser(){
        return userMapper.selectAll();
    }

    public User selectUserByUserId(Integer userId){
        return userMapper.selectByPrimaryKey(userId);
    }
}
