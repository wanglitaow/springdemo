package com.wlt.mall.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * order_log
 * @author 
 */
public class OrderLog implements Serializable {
    /**
     * 操作id
     */
    private Integer id;

    /**
     * 操作用户名,0为系统级
     */
    private String uid;

    /**
     * 操作用户ip
     */
    private String ip;

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

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 最后修改时间
     */
    private Date mtime;

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderLog other = (OrderLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOpData() == null ? other.getOpData() == null : this.getOpData().equals(other.getOpData()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getOpObject() == null ? other.getOpObject() == null : this.getOpObject().equals(other.getOpObject()))
            && (this.getOpName() == null ? other.getOpName() == null : this.getOpName().equals(other.getOpName()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getMtime() == null ? other.getMtime() == null : this.getMtime().equals(other.getMtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOpData() == null) ? 0 : getOpData().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getOpObject() == null) ? 0 : getOpObject().hashCode());
        result = prime * result + ((getOpName() == null) ? 0 : getOpName().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getMtime() == null) ? 0 : getMtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", ip=").append(ip);
        sb.append(", orderId=").append(orderId);
        sb.append(", opData=").append(opData);
        sb.append(", remark=").append(remark);
        sb.append(", opObject=").append(opObject);
        sb.append(", opName=").append(opName);
        sb.append(", ctime=").append(ctime);
        sb.append(", mtime=").append(mtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}