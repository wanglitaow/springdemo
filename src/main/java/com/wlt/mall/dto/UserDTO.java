package com.wlt.mall.dto;

import com.wlt.mall.Anno.FruitName;

import java.io.Serializable;

// xu lie hua
public class UserDTO implements Serializable {

    private Integer age;


    @FruitName("测试Appleddd")
    private  String name ;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    @RedisCache
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "UserDTO{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
