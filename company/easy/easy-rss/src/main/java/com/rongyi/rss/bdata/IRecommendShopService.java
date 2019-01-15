package com.rongyi.rss.bdata;

import com.rongyi.easy.bdata.entity.Shop;
import com.rongyi.easy.bdata.param.ShopSearchParam;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/1/26
 */
public interface IRecommendShopService {
    /**
     * 获取智能推荐列表
     * @param shopSearchParam
     * @param strategies
     * @param count
     * @return
     */
    List<Shop> getRecommendList(ShopSearchParam shopSearchParam, List<String> strategies, int count);
}
