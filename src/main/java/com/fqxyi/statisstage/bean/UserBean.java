package com.fqxyi.statisstage.bean;

import java.io.Serializable;

/**
 * @author ShenBF
 * @desc 要存储的对象
 * @date 2018/8/1
 */
public class UserBean implements Serializable {

    private static final long serialVersionUID = -1L;

    private String username;
    private Integer age;

    public UserBean(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}