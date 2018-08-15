package com.example.demo;/**
 * @author: ZhangJiaqian
 * @createtime: 2018-08-13 15:17
 * @description: j
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *@program: demo
 *
 *@description: j
 *
 *@author: ZhangJiaqian
 *
 *@createtime: 2018-08-13 15:17
 */
@Component
@ConfigurationProperties(prefix = "student")
public class StudentProperties {

    private String name;

    private Integer age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
