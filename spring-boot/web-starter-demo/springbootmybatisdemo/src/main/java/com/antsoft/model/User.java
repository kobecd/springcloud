package com.antsoft.model;

import com.antsoft.database.BaseEntity;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by justin on 16/2/28.
 */
@Table(name="t_user")
public class User extends BaseEntity {
    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;
    /**
     * 账户类型
     */
    private Integer accountType;
    /**
     * 余额
     */
    private BigDecimal balance;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 微信用户
     */
    private String openid;

    /**
     * 手机号
     */
    private String mobileNo;
    /**
     * 推荐人手机号
     */
    private String recommendMobileNo;

    /**
     * 注册时间
     */
    private Date regTime;

    /**
     * 更新时间
     */
    private Date lastModifyTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * clientId
     */
    private String clientId;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 账号描述
     */
    private String accountDesc;

    private String signature;
    /**
     * 性别{1:男,0:女}
     */
    private Integer sex;
    /**
     * 用户类型{1:vip,0:普通}
     */
    private Integer vip;
    /**
     * 登录经度
     */
    private Float lastLoginLon;
    /**
     * 登录维度
     */
    private Float lastLoginLat;

    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

    private Integer openPush;
    private Integer openSound;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getRecommendMobileNo() {
        return recommendMobileNo;
    }

    public void setRecommendMobileNo(String recommendMobileNo) {
        this.recommendMobileNo = recommendMobileNo;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAccountDesc() {
        return accountDesc;
    }

    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Float getLastLoginLon() {
        return lastLoginLon;
    }

    public void setLastLoginLon(Float lastLoginLon) {
        this.lastLoginLon = lastLoginLon;
    }

    public Float getLastLoginLat() {
        return lastLoginLat;
    }

    public void setLastLoginLat(Float lastLoginLat) {
        this.lastLoginLat = lastLoginLat;
    }

    public Integer getOpenPush() {
        return openPush;
    }

    public void setOpenPush(Integer openPush) {
        this.openPush = openPush;
    }

    public Integer getOpenSound() {
        return openSound;
    }

    public void setOpenSound(Integer openSound) {
        this.openSound = openSound;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
