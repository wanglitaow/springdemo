package com.wlt.mall;


import com.wlt.mall.dto.StundentDto;
import com.wlt.mall.serivce.OrderLogService;
import com.wlt.mall.serivce.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

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

            OrderLogService orderService = new OrderLogService();

            System.out.println(orderService.getCnt());;

        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }




    }




}
