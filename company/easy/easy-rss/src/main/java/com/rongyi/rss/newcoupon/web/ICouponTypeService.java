package com.rongyi.rss.newcoupon.web;

import com.rongyi.easy.newcoupon.dto.CouponTypeDTO;

import java.util.List;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/20 17:13
 * Package:com.rongyi.rss.newcoupon.web
 * Project:easy-coupon
 */
public interface ICouponTypeService {
    List<CouponTypeDTO> findAll();

    Boolean insert(CouponTypeDTO couponTypeDTO);

}
