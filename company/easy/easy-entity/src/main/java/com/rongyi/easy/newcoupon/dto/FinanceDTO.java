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
 * @date: 2017/11/2
 */
@Setter
@Getter
@ToString(callSuper = true)
public class FinanceDTO implements Serializable {

    /**
     * 卡券面额
     */
    private Double price;
    /**
     * 优惠补贴方0：总部；1：店铺
     */
    private Integer subsidyType;

    /** 结算。0：统一设置；1：按店铺设置 */
    private Integer chargingSettleType;

    /**
     * 店铺结算设置
     */
    private List<ShopSettleDTO> shopSettleDTOS;

    public boolean isNullObject(){
        return price == null && subsidyType == null && chargingSettleType == null && shopSettleDTOS == null;
    }
}
