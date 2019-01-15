package com.rongyi.rss.payapi.service;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.rss.payapi.param.PayRefundParam;

/**
 * 退款接口
 * Created by sujuan on 2017/7/7.
 */
public interface RefundService {

    /**
     * 退款接口
     * @param param 参数
     * @return 返回结果
     */
    ResponseData payRefund(PayRefundParam param);
}
