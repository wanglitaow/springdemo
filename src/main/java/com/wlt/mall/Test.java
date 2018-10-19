package com.wlt.mall;


import com.wlt.mall.dto.StundentDto;

public class Test {




    public class FanxingService<T> {

        private T key;


        public T getKey() {
            return key;
        }

        public void setKey(T key) {
            this.key = key;
        }
    }

    public static void main(String[] args){

        System.out.println(new StundentDto());

        try {

            System.out.println(1);

        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }




    }




}
