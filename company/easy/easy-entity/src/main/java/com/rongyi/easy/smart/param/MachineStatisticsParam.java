package com.rongyi.easy.smart.param;

/**
 * Created by yandong on 2017/12/29.
 */
public class MachineStatisticsParam {

    private Integer page;

    private Integer pageSize;

    private String source;

    private String mallId;

    private String layoutId;

    private String mouldId;

    private String dateType;

    private String startTime;

    private String endTime;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }


    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public String getMouldId() {
        return mouldId;
    }

    public void setMouldId(String mouldId) {
        this.mouldId = mouldId;
    }

    @Override
    public String toString() {
        return "MachineStatisticsParam{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", source='" + source + '\'' +
                ", mallId='" + mallId + '\'' +
                ", layoutId='" + layoutId + '\'' +
                ", mouldId='" + mouldId + '\'' +
                ", dateType='" + dateType + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
