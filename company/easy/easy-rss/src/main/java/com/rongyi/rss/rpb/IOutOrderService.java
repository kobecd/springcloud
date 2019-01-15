package com.rongyi.rss.rpb;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.third.exception.ThirdException;
import com.rongyi.easy.rpb.param.OutOrderUpdateParam;

/**
 * Created by shaozhou on 2018/2/26.
 * 外部订单调用接口
 */
public interface IOutOrderService {
    /**
     * 查询外部订单详情
     * @param orderNo
     * @return
     */
    ResponseData querySalesOrder(String orderNo) throws ThirdException, Exception;

    void updateSalesOrder(OutOrderUpdateParam updateParam);
}
