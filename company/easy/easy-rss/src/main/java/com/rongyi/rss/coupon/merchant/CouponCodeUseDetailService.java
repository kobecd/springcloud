package com.rongyi.rss.coupon.merchant;

import com.rongyi.easy.coupon.vo.merchant.CouponCodeUseDetailVO;
import com.rongyi.easy.coupon.vo.merchant.MerchantPaging;
import com.rongyi.easy.page.QueryParam;

import java.util.List;

/**
 * Descriptions:
 * Created by yb
 * Created at 2015/9/10 19:44.
 */
public interface CouponCodeUseDetailService {

     MerchantPaging<CouponCodeUseDetailVO> findUseDetailsByPage(QueryParam queryParam);

     List<CouponCodeUseDetailVO> findUseDetailsByCouponId(String couponId);
}
