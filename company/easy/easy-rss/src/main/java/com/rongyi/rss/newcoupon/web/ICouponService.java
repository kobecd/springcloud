package com.rongyi.rss.newcoupon.web;

import com.rongyi.easy.newcoupon.dto.CouponDTO;
import com.rongyi.easy.newcoupon.vo.CouponVO;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/1
 */
public interface ICouponService {

    /**
     * 新增
     * @param couponDTO
     * @return
     */
    Integer save(CouponDTO couponDTO);

    /**
     * 新增
     * @param couponDTO
     * @return
     */
    Integer update(CouponDTO couponDTO);

    /**
     * 卡券详情
     * @param couponId
     * @return
     */
    CouponVO detail(Integer couponId);
}
