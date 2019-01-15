package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.util.Date;

/*
 * Description:  生成订单状态记录（暂用于电子会员订单扣减积分失败记录）
 * Author: zhuming 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * zhuming     2018/1/23    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class OrderStatusFormEntity implements Serializable {

    private static final long serialVersionUID = -2090374814838848023L;

    //主键id
    private Integer id;
    //大订单号
    private String orderNo;
    //买家id
    private String buyerId;
    //状态1失败
    private String status;
    //错误信息
    private String errorInfo;
    //创建时间
    private Date createAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "OrderStatusFormEntity{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", status='" + status + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
