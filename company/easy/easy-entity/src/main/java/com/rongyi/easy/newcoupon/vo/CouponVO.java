package com.rongyi.easy.newcoupon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/29
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CouponVO extends BaseVO {
    /**
     * 1.代金券
     */
    private Integer type;

    /**
     * 卡券状态 0：草稿；1：待审核；2：审核通过；3：审核不通过  4: 待发布  5：发布中；6：终止（下架）
     */
    private Integer status;

    /**
     * 代金券
     */
    private CouponVoucherVO voucher;

    /**
     * 折扣券
     */
    private CouponDiscountVO discount;

    /**
     * 折扣券
     */
    private CouponExchangeVO exchange;

    /**
     * 卡券基础信息
     */
    private BaseCouponVO baseCoupon;


    private MerChantVO merchant;


    /**
     * 卡券核销限制
     */
    private UseCouponVO useCoupon;

    /**
     * 财务设置
     */
    private FinanceVO financeInfo;
}
