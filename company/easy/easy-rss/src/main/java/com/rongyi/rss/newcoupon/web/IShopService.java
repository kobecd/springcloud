package com.rongyi.rss.newcoupon.web;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.newcoupon.dto.ShopCategoryQueryDTO;
import com.rongyi.easy.newcoupon.dto.ShopQueryDTO;
import com.rongyi.easy.newcoupon.vo.MerChantVO;
import com.rongyi.easy.newcoupon.vo.ShopCategoryQueryVO;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/16
 */
public interface IShopService {

    /**
     * 根据商户id查询商户详情
     * @param merchantId
     * @return
     */
    MerChantVO getMerchantInfoById(String merchantId);

    /**
     * 子店铺列表
     * @param queryDTO
     * @return
     */
    ResponseVO childList(ShopQueryDTO queryDTO);

    /**
     * 查询商场类目
     * @param categoryDTO 查询参数
     * @return 类目列表
     */
    List<ShopCategoryQueryVO> categoryList(ShopCategoryQueryDTO categoryDTO);

    /**
     * 根据categoryId获取他的层级名，并用
     * @param categoryId
     * @return
     */
    List<String> getHierarchicalNamesByCategoryId(String categoryId);

}
