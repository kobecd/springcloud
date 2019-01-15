package com.rongyi.rss.code;

import com.rongyi.core.framework.exception.CodeServiceException;
import com.rongyi.easy.coupon.param.RmmmValidCodeParam;
import com.rongyi.easy.coupon.vo.RmmmValidCodeVO;

/**
 * @author: yb
 * Description:对外券码核销接口
 * DATE: 2018/2/7 10:28
 * Package:com.rongyi.rss.code
 * Project:easy-common
 */
public interface IVerifyCouponCodeService {
    /**
     * 代金券核销
     * @param rmmmValidCodeParam
     * @return
     * @throws Exception
     */
    RmmmValidCodeVO verifyCouponCode(RmmmValidCodeParam rmmmValidCodeParam) throws CodeServiceException;
}
