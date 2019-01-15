package com.rongyi.hla.service.product;

import com.rongyi.entity.product.PullLog;

import java.util.List;

/**
 * PullLogService接口
 */
public interface PullLogService {

    int save(PullLog pullLog);

    List<PullLog> list();

    /**
     * 获取最新的请求时间
     *
     * @param name
     * @return
     */
    PullLog getLatestRequest(String name);
}
