package com.wlt.mall.vo;

import java.io.Serializable;
import java.util.Date;

public class OrderLogVo implements Serializable {

    /**
     * 操作id
     */
    private Integer id;



    /**
     * 操作用户名,0为系统级
     */
    private String uid;


    /**
     * 订单号
     */
    private String orderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderLogVo{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", orderId='" + orderId + '\'' +
                '}';
    }




}