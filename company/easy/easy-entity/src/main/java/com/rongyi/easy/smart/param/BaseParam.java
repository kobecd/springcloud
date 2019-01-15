package com.rongyi.easy.smart.param;

import java.io.Serializable;

/**
 * Created by yandong on 2017/10/18.
 */
public class BaseParam implements Serializable{

    private Integer pageSize;

    private Integer currentPage;

    private Integer startRecordIndex;

    private String userName;

    private String mallId;//商场ID

    private Integer caseId;//模板ID

    private Integer updateAt;

    private String updateBy;

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getStartRecordIndex() {
        if(currentPage != null && pageSize != null){
            startRecordIndex = (currentPage - 1) * pageSize;
        }
        return startRecordIndex;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public void setStartRecordIndex(Integer startRecordIndex) {
        this.startRecordIndex = startRecordIndex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return "BaseParam{" +
                "pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", startRecordIndex=" + startRecordIndex +
                ", userName='" + userName + '\'' +
                ", mallId='" + mallId + '\'' +
                ", caseId=" + caseId +
                ", updateAt=" + updateAt +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}
