package com.rongyi.easy.newcoupon.vo;

import com.rongyi.easy.mcmc.CommodityCategory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/17
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CommodityCategoryQueryVO extends BaseVO {

    private String categoryId;

    private String categoryName;

    private List<CommodityCategoryQueryVO> childCategories;

    public CommodityCategoryQueryVO(){}

    public CommodityCategoryQueryVO(CommodityCategory commodityCategory){
        this.setCategoryId(commodityCategory.getId().toString());
        this.setCategoryName(commodityCategory.getName());
    }
}
