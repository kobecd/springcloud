package com.rongyi.common.dto;

/**
 * @Description:
 * @Author: 梁来宾
 * @Date: Created in 2018/3/1 17:45
 */
public class PageRequDTO extends RequDTO{
	private static final long serialVersionUID = 1L;
	private Integer currentPage = 1;    //当前页：统一从1开始
    private Integer pageSize = 10;    //每页行数

    public Integer getCurrentPage() {
        return currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PageRequDTO [currentPage=" + currentPage + ", pageSize=" + pageSize + "]";
    }

}
