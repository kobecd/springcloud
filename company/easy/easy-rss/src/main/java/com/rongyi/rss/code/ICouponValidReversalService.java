package com.rongyi.rss.code;

import com.rongyi.core.framework.exception.CodeServiceException;
import com.rongyi.easy.coupon.param.CouponReversalParam;

/**
 * 卡券冲正服务
 * @author: yb
 * Description:
 * DATE: 2017/12/27 17:06
 * Package:com.rongyi.rss.code
 * Project:easy-common
 */
public interface ICouponValidReversalService {

    /**
     * 已核销卡券冲正
     * @param couponReversalParam
     * @return
     */
    boolean couponReversal(CouponReversalParam couponReversalParam) throws CodeServiceException;
}
