package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/27 16:57
 * Package:com.rongyi.easy.newcoupon.dto
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString
public class CouponPageSettingDTO implements Serializable {

    private static final long serialVersionUID = 1772359444573684364L;

    /** 卡券id */
    private Integer couponId;
    /** 自定义卡券类型名称 */
    private String showType;
    /** 自定义卡券名称 */
    private String showName;
    /** 图片列表。；号隔开 */
    private String pictures;
    /** 是否展示图片.0:否；1：是 */
    private Integer showPic;
    /** 使用规则 */
    private String useLimit;
    /** 是否展示有效期。0：否；1：是 */
    private Integer showExpired;
    /** 是否显示使用场景。0：否；1：是 */
    private Integer showScenario;
    /** 是否显示可用时段。0：否；1：是 */
    private Integer showUseTime;
    /** 是否显示适用店铺；0：否；1：是 */
    private Integer showUseShop;
    /** 是否显示用户身份限制。0：否；1：是 */
    private Integer showUserIdentity;
    /** 创建时间 */
    private Date createAt;
    /** 更新时间 */
    private Date updateAt;
    /** 创建人 */
    private Integer createBy;
    /**  更新人*/
    private Integer updateBy;
}
