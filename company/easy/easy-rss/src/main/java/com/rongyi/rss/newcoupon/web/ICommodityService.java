package com.rongyi.rss.newcoupon.web;

import com.rongyi.easy.mcmc.vo.CommodityPagePinTuanVO;
import com.rongyi.easy.newcoupon.dto.CommodityCategoryQueryDTO;
import com.rongyi.easy.newcoupon.dto.CommodityQueryDTO;
import com.rongyi.easy.newcoupon.vo.CommodityCategoryQueryVO;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/16ShopQueryDTO
 */
public interface ICommodityService {

    /**
     * 根据商户id查询该商户所有的商品
     * @param commodityQueryDTO 商户参数
     * @return 商品列表
     */
    CommodityPagePinTuanVO commodityList(CommodityQueryDTO commodityQueryDTO);

    /**
     * 商品类目
     * @param categoryDTO 类目参数
     * @return 类目列表
     */
    List<CommodityCategoryQueryVO> categoryList(CommodityCategoryQueryDTO categoryDTO);

    List<String> getHierarchicalNamesByCategoryId(String categoryId);
}
