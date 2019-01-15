package com.rongyi.common.dto;

/**
 * @Description:
 * @Author: 梁来宾
 * @Date: Created in 2018/3/1 17:46
 */
public class PageRespDTO extends PageRequDTO {
	private static final long serialVersionUID = 1L;
    private Integer totalCount = 0;    //总行数

    public Integer getTotalPage() {
        Integer pageSize = getPageSize();
        if (pageSize != null && pageSize > 0) {
            return (totalCount + pageSize - 1) / getPageSize();
        }
        return null;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
