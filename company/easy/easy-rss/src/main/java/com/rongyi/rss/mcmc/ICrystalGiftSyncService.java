package com.rongyi.rss.mcmc;

import com.rongyi.core.bean.ResponseVO;

/**
 * 晶品的礼品与第三方平台同步的服务
 */
public interface ICrystalGiftSyncService {

    /**
     * 刷新第三方平台的所有礼品信息到本地库
     * @return
     */
    public ResponseVO refreshAllGiftList();
}
