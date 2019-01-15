package com.rongyi.easy.newcoupon.vo;

import com.rongyi.easy.newcoupon.dto.CommodityDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/1/5
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CouponExchangeVO extends BaseVO {

    /**0：线下自定义商品， 1：线上商品， 2：卡券*/
    private Integer type;

    private String offLineCommodityDesc;

    private List<Integer> couponIds;

    private List<CommodityDTO> onLineCommodityList;
}
