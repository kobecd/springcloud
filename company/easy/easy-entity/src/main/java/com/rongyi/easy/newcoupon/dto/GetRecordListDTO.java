package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/24 15:58
 * Package:com.rongyi.easy.newcoupon.dto
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString
public class GetRecordListDTO implements Serializable{
    private static final long serialVersionUID = 6731856407206969918L;

    private Integer id;

    /** 卡券id */
    private Integer couponId;
    /** 卡券名称 */
    private String couponName;
    /** 卡券类型名称 */
    private String couponTypeName;
    /** 券码 */
    private String couponCode;
    /** 领取用户 */
    private String getUser;
    /** 用户身份 */
    private String getUserIdentity;
    /** 领取时间 */
    private String getAt;
    /** 过期时间 */
    private String expiredAt;
    /** 使用状态 */
    private Integer status;
    /** 核销时间 */
    private String validAt;
    /** 核销渠道 */
    private Integer validChannel;
    /** 领取渠道 */
    private Integer getChannel;
    /** 领取页面 */
    private String getPage;
}

