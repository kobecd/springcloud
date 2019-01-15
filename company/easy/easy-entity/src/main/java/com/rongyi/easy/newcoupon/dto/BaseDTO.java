package com.rongyi.easy.newcoupon.dto;

import com.rongyi.core.constant.Constants;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/14
 */
@Setter
@Getter
@ToString
public class BaseDTO implements Serializable {
    private Integer currentPage = Constants.CouponPage.CURRENT_PAGE ;

    private Integer pageSize = Constants.CouponPage.PAGE_SIZE;

    /**
     * 翻页开始的数量
     */
    private Integer startCount;

    public Integer getStartCount() {
        return (this.getCurrentPage()-1)*this.getPageSize();
    }

}
