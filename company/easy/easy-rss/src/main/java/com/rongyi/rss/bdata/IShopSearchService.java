package com.rongyi.rss.bdata;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.bdata.entity.Shop;
import com.rongyi.easy.bdata.param.ShopSearchParam;
import com.rongyi.easy.bdata.vo.ShopVO;

import java.util.List;

/**
 * Created by WUH on 2017/5/19.
 * 店铺搜索接口
 */
public interface IShopSearchService {

    Shop getShopById(String id);

    ShopVO getShopVOById(String id);

    List<Shop> getShopByNature(ShopSearchParam searchParam, boolean includeItsChildren);

    List<Shop> getChildShop(ShopSearchParam searchParam);

    ResponseVO queryShop(ShopSearchParam searchParam);

    ResponseVO queryShopVO(ShopSearchParam searchParam);

    int queryShopCount(ShopSearchParam searchParam);

    ResponseVO queryShopExcludeSpecified(ShopSearchParam specifiedParam, List<Shop> needExcludeIds);

    String getShopLogo(String shopId);

}
