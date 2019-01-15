package com.rongyi.easy.newcoupon.vo;

import com.rongyi.easy.shop.entity.MallCustomCategoryEntity;
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
public class ShopCategoryQueryVO extends BaseVO {

    private String id;

    private String name;

    List<ShopCategoryQueryVO> childCategories;

    public ShopCategoryQueryVO(){}

    public ShopCategoryQueryVO(MallCustomCategoryEntity categoryEntity){
        this.setId(categoryEntity.getId().toString());
        this.setName(categoryEntity.getName());
    }
}
