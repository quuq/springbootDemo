package com.example.demo.mapper;

import com.example.demo.entity.User;
import tk.mybatis.mapper.common.Mapper;


/**
 * @author: ZhangJiaqian
 * @createtime: 2018-08-13 15:54
 * @description: ${description}
 */
//@Repository
    @org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
}
