package com.wlt.mall.dto;


public class StundentDto  {

    private Integer age;


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

//

    @Override
    public String toString() {
        return "UserDTO{" +
                "agedd=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
