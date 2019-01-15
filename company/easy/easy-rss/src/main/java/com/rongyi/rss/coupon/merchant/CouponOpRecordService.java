package com.rongyi.rss.coupon.merchant;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.CouponOpRecord;

import java.util.List;

/**
 * Description:
 * Author: yb
 * DATE: 2016/8/8 17:22
 * Package:com.rongyi.rss.coupon.merchant
 * Project:easy-market
 */
public interface CouponOpRecordService {
     int insert(CouponOpRecord couponOpRecord);

     PagingVO<CouponOpRecord> findByPage(String mallId, Integer pageNo, Integer pageSize);
}
