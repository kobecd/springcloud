package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * Description:
 * Author: yb
 * DATE: 2017/10/31 10:19
 * Package:com.rongyi.coupon.dal.domain.vo
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString
public class CouponListWebDTO implements Serializable {

    private static final long serialVersionUID = 3892981763209694265L;

    private Integer id;

    /**
     * 卡券名称
     */
    private String name;

    /**
     * 卡券编号
     */
    private String couponNo;

    /**
     * 卡券类型
     */
    private String couponTypeName;

    /**
     * 发布总量
     */
    private Integer totalCount;

    /**
     * 库存
     */
    private Integer stockCount;

    /**
     * 领取数
     */
    private Integer receiveCount;

    /**
     * 卡券来源
     */
    private String couponSource;

    /**
     * 券码来源
     */
    private String codeSource;


    /**
     * 创建商户名称
     */
    private String merchantName;

    /**
     * 商户类型。0：总部；1：商场；2：店铺 3：单店铺
     */
    private Integer merchantType;

    /**
     * 创建账号
     */
    private String createUser;

    /**
     * 有效期
     */
    private String indate;

    /**
     * 发布时间
     */
    private String publishDate;

    /**
     * 发布渠道
     */
    private String publishChannel;

    /**
     * 状态。0：草稿；1：待审核；2：挂起；3：审核通过；4：审核不通过  5: 待发布  6：发布中；7：终止（下架） 8:删除
     */
    private Integer status;

    /**
     * 0：不可发布；1：可发布
     */
    private Integer publishable;

    /**
     * 申请店铺
     */
    private String applyShop;

    private String applyDate;

}
