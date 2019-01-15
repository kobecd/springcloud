package com.rongyi.easy.content_v2.param;

import com.rongyi.core.constant.Constants;
import com.rongyi.easy.rpb.dto.BaseDto;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/20 16:50
 * Package:com.rongyi.easy.content_v2.param
 * Project:easy-common
 */
public class RongyiCaseQueryParamDTO implements Serializable {

    /**类型*/
    private Integer type;

    private Integer currentPage;

    private Integer pageSize;

    private Integer startRow;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCurrentPage() {
        return currentPage== null? Constants.CouponPage.CURRENT_PAGE:currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize==null?Constants.CouponPage.PAGE_SIZE:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartRow() {
        return (this.getCurrentPage()-1)*this.getPageSize();
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
