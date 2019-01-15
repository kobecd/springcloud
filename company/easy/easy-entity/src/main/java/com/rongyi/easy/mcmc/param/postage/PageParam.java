package com.rongyi.easy.mcmc.param.postage;

import java.io.Serializable;

/**
 * 分页查询
 * Created by zhoukunkun on 2017/6/16.
 */
public class PageParam implements Serializable {

    private static final long serialVersionUID = -1917095448754112191L;

    private int currentPage = 0;
    private int pageSize = 0;
    private Integer pageType = 0; // 分页[0]、不分页[1]。默认0

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageType() {
        return pageType;
    }

    public void setPageType(Integer pageType) {
        this.pageType = pageType;
    }

    @Override
    public String toString() {
        return "PageParam{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", pageType=" + pageType +
                '}';
    }
}
