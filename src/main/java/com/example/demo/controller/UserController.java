package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: ZhangJiaqian
 * @createtime: 2018-08-13 16:04
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public List<UserModel> getAllUser() {
        List<User> userList = new ArrayList<>();
        userList = userService.selectAllUser();
        List<UserModel> list = new ArrayList<>();

        if (null != userList) {
            for (User uf : userList) {
                UserModel userModel = new UserModel();
                userModel.setUserName(uf.getUserName());
                userModel.setUserAge(uf.getUserAge());
                list.add(userModel);
            }
            return list;
        } else
            return null;
    }

    @RequestMapping(value = "/user/{Id}", method = RequestMethod.GET)
    public UserModel getUserInfo(@PathVariable("Id") Integer userId) {
        User user = userService.selectUserByUserId(userId);
        if (null != user) {
            UserModel userModel = new UserModel();
            userModel.setUserName(user.getUserName());
            userModel.setUserAge(user.getUserAge());
            return userModel;
        }
        return null;
    }
}


