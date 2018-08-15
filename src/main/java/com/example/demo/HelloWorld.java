package com.example.demo;/**
 * @author: ZhangJiaqian
 * @createtime: 2018-08-13 14:47
 * @description: helloWorld
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: demo
 *
 *@description: helloWorld
 *
 *@author: ZhangJiaqian
 *
 *@createtime: 2018-08-13 14:47
 */
@RestController //@Controller + @ResponseBody
public class HelloWorld {

    @Autowired
    private StudentProperties studentProperties;

    @RequestMapping("/hello")
    public String hello(){
        return studentProperties.getName() + " "
                + studentProperties.getAge() ;
    }

}
