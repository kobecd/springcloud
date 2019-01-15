package com.rongyi.rss.newcoupon.web;

import com.rongyi.easy.newcoupon.dto.CouponPageSettingDTO;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/27 16:54
 * Package:com.rongyi.rss.newcoupon.web
 * Project:easy-coupon
 */
public interface ICouponPageSettingService {
     /**
      * 插入页面设置
      * @param couponPageSettingDTO
      * @return
      */
     Boolean insert(CouponPageSettingDTO couponPageSettingDTO);

     /**
      * 查找页面设置
      * @param couponId
      * @return
      */
     CouponPageSettingDTO getByCouponId(Integer couponId);
}
