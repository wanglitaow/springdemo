package com.wlt.mall;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

class User{

    public  String name;

    public  int age;



    void setName(String name ){

        this.name = name ;
    }


    void setAge(int age){
        this.age = age;
    }

}

public class JsonTest {

    public static void main(String[] args) {
        User u1 = new User();
        u1.setAge(10);
        u1.setName("wanglitao");

        String json = JSON.toJSONString(u1);
        JSON.parse(json);


        JSONObject  x = new JSONObject();

        x = JSON.parseObject(json);

//        System.out.println(x);


        ArrayList<User> ulist = new ArrayList<>() ;

        Iterator<User> xx = ulist.iterator();


        while (xx.hasNext()){

           User a1 = xx.next();

           System.out.println(a1);

        }



        ulist.add(u1);
        ulist.add(u1);




//        System.out.println(ulist);


        Testarray();




//        return JSONObject.parseObject(ans);





    }





     static  void Testarray(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        // 遍历

        for (Integer i : arrayList){
            System.out.println(i);
        }
        // 迭代器遍历

        Iterator<Integer> it = arrayList.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (int i= 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }





}
