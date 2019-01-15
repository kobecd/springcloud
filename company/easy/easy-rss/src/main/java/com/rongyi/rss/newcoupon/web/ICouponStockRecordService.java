package com.rongyi.rss.newcoupon.web;

import com.rongyi.easy.newcoupon.dto.CouponStockRecordDTO;

import java.util.List;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/28 14:44
 * Package:com.rongyi.rss.newcoupon.web
 * Project:easy-coupon
 */
public interface ICouponStockRecordService {

    /**
     * 根据卡券id 获取卡券库存绑定记录
     * @param couponId
     * @return
     */
    List<CouponStockRecordDTO> listFindByCouponId(Integer couponId);
}
