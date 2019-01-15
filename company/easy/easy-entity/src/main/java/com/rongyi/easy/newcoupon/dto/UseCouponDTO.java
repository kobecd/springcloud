package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/10/30
 * 使用限制
 */
@Setter
@Getter
@ToString(callSuper = true)
public class UseCouponDTO implements Serializable {

    /**
     * 0:全部时段可用， 1：部分时段可用
     */
    private Integer availableTimesType;

    /**
     * 可用时段
     */
    private List<TimePlugin> availableTimes;

    /**
     * 用户身份限制。0：粉丝，1：会员
     */
    private List<Integer> identifyLimit;

    /**
     * 会员列表限制
     */
    private List<String> memberLimitList;

    /**
     * 是否允许重复使用
     */
    private Boolean canRepeat;

    /**
     * 单笔消费限制使用张数
     */
    private Integer limitCountPerConsume;

    /**
     * 消费满的金额
     */
    private Double consumeAmount;

    /**
     * 消费满的件数
     */
    private Integer consumeCount;

    /** 0:全部店铺；1：指定分类店铺；2：指定店铺 */
    private Integer applyShopType;

    /**
     * 指定店铺
     */
    private List<ShopDTO> shopDTOList;

    /**
     * 指定品类
     */
    private List<ShopCategoryDTO> shopCategoryList;



    /** 0:全部商品；1：指定分类商品；2：指定商品 */
    private Integer applyCommodityType;

    /**
     * 指定商品
     */
    private List<CommodityDTO> commodityList;

    /**
     * 指定品类
     */
    private List<CommodityCategoryDTO> commodityCategoryList;

    /**
     * 使用场景 0：线上&线下, 1：线上，2：线下
     */
    private Integer useScenario;

    /**
     * 核销权限，0：店铺总部都可 1：店铺核销， 2：总部核销
     */
    private Integer checkType;
}
