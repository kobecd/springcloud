package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/*
 * Description:  订单合并
 * Author: zhuming 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * zhuming     2017/9/25    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class OrderMergeParams implements Serializable {

    private static final long serialVersionUID = 8805374795225734658L;

    private String buyerId;//用户id

    private String phone;//用户手机号

    private String memberName;// 用户昵称

    private String userName;//会员姓名

    private String openId;//微信openId

    private String newBuyerId;//新用户id（合并后）

    private String newPhone;//新用户手机号（合并后）

    private String newMemberName;// 新用户昵称（合并后）

    private String newUserName;//新会员姓名（合并后）

    private String newOpenId;//新微信openId（合并后）

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNewBuyerId() {
        return newBuyerId;
    }

    public void setNewBuyerId(String newBuyerId) {
        this.newBuyerId = newBuyerId;
    }

    public String getNewPhone() {
        return newPhone;
    }

    public void setNewPhone(String newPhone) {
        this.newPhone = newPhone;
    }

    public String getNewMemberName() {
        return newMemberName;
    }

    public void setNewMemberName(String newMemberName) {
        this.newMemberName = newMemberName;
    }

    public String getNewUserName() {
        return newUserName;
    }

    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }

    public String getNewOpenId() {
        return newOpenId;
    }

    public void setNewOpenId(String newOpenId) {
        this.newOpenId = newOpenId;
    }

    @Override
    public String toString() {
        return "OrderMergeParams{" +
                "buyerId='" + buyerId + '\'' +
                ", phone='" + phone + '\'' +
                ", memberName='" + memberName + '\'' +
                ", userName='" + userName + '\'' +
                ", openId='" + openId + '\'' +
                ", newBuyerId='" + newBuyerId + '\'' +
                ", newPhone='" + newPhone + '\'' +
                ", newMemberName='" + newMemberName + '\'' +
                ", newUserName='" + newUserName + '\'' +
                ", newOpenId='" + newOpenId + '\'' +
                '}';
    }
}
