package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/28 14:30
 * Package:com.rongyi.easy.newcoupon.dto
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString
public class CouponStockRecordDTO implements Serializable {
    private static final long serialVersionUID = -6745675110480130128L;
    /** 1：卡券商城；2：积分商城；3：营销中心；4：游戏中心；5:互动屏；6：第三方平台 ；7：领券频道' */
    private Integer getChannel;
    /** 活动id */
    private Integer activityId;
    /** 活动名称 */
    private String activityName;
    /** 卡券id */
    private Integer couponId;
    /** 锁定的库存 */
    private Integer lockStock;
    /** 创建日期 */
    private Date createAt;
    /** 0:初始绑定；1：追加 */
    private Integer getType;

}
