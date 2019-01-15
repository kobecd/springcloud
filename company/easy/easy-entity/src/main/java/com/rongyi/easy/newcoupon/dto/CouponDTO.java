package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/10/30
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CouponDTO implements Serializable {
    /**
     * VOUCHER(1, "代金券"),
     * DISCOUNT(2, "折扣券"),
     */
    private Integer type;

    /**
     * 卡券状态 0：草稿；1：待审核；2：审核通过；3：审核不通过  4: 待发布  5：发布中；6：终止（下架）
     */
    private Integer status;
    /**
     * 代金券
     */
    private CouponVoucherDTO voucher;
    /**
     * 折扣券
     */
    private CouponDiscountDTO discount;

    /**
     * 兑换券
     */
    private CouponExchangeDTO exchange;

    /**
     * 卡券基础信息
     */
    private BaseCouponDTO baseCoupon;

    /**
     * 卡券核销限制
     */
    private UseCouponDTO useCoupon;

    /**
     * 财务设置
     */
    private FinanceDTO financeInfo;

}
