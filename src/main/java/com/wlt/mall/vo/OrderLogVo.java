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

    /**
     * 操作前内容
     */
    private String opData;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作对象
     */
    private String opObject;

    /**
     * 操作类型
     */
    private String opName;


    private static final long serialVersionUID = 1L;

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

    public String getOpData() {
        return opData;
    }

    public void setOpData(String opData) {
        this.opData = opData;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOpObject() {
        return opObject;
    }

    public void setOpObject(String opObject) {
        this.opObject = opObject;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }



    @Override
    public String toString() {
        return "OrderLogVo{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", orderId='" + orderId + '\'' +
                ", opData='" + opData + '\'' +
                ", remark='" + remark + '\'' +
                ", opObject='" + opObject + '\'' +
                ", opName='" + opName + '\'' +
                '}';
    }
}