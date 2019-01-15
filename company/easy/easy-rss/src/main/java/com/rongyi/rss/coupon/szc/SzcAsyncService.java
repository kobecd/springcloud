package com.rongyi.rss.coupon.szc;

import com.rongyi.easy.coupon.entity.Coupon;

/**
 * Created by yandong on 2017/7/28.
 */
public interface SzcAsyncService {

    public void sendSms(String couponId);

    public void pushCoupon(Integer batchId, Coupon coupon);
}
