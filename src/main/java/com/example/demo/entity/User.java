package com.example.demo.entity;/**
 * @author: ZhangJiaqian
 * @createtime: 2018-08-13 15:54
 * @description: ll
 */


import javax.persistence.Column;
import javax.persistence.Table;

/**
 *@program: demo
 *
 *@description: ll
 *
 *@author: ZhangJiaqian
 *
 *@createtime: 2018-08-13 15:54
 */
@Table(name = "t_user")
public class User {
    @javax.persistence.Id  //等价于@Id
    //@Column(name = "user_id")
    private Integer userId;

    //@Column(name = "user_name")
    private String userName;

    //@Column(name = "password")
    private String password;

   // @Column(name = "user_age")
    private  String userAge;

    //@Column(name = "pic_url")
    private String picUrl;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
