package com.rongyi.easy.smart.entity;

import com.rongyi.easy.smart.vo.SourceVO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yandong on 2017/10/16.
 */
public class CaseLayer implements Serializable {

    private Integer id;
    private Integer caseId;
    private String mallId;
    private Integer top;
    private Integer left;
    private Integer width;
    private Integer height;
    private Integer type; //图层类型:0简单图层,1图片,2视频,3flash,4时间和日期,5外链url,6电子货架-分类,7电子货架爆款,8电子易拉宝视频或图片,9文字图层，10广告图层
    private String detail;//图层 内容详情（只有在类型是日期或者天气，外链url时有用），存设置的json 或 外链的url
    private Integer interval;//图片播放的间隔】
    private Integer index;
    private Integer state;//状态， 1 正常， 0 删除
    private Integer createAt;
    private Integer updateAt;
    private String createBy;
    private String updateBy;
    private String resolution;
    private Integer pageId;
    
    private Object detailMap;
    private String caseName;//模板名称
    private Integer layoutId;
    private Integer isTemplate;

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Object getDetailMap() {
        return detailMap;
    }

    public void setDetailMap(Object detailMap) {
        this.detailMap = detailMap;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Integer isTemplate) {
        this.isTemplate = isTemplate;
    }

    @Override
    public String toString() {
        return "CaseLayer{" +
                "id=" + id +
                ", caseId=" + caseId +
                ", mallId='" + mallId + '\'' +
                ", top=" + top +
                ", left=" + left +
                ", width=" + width +
                ", height=" + height +
                ", type=" + type +
                ", detail='" + detail + '\'' +
                ", interval=" + interval +
                ", index=" + index +
                ", state=" + state +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", resolution='" + resolution + '\'' +
                ", pageId=" + pageId +
                ", detailMap=" + detailMap +
                ", caseName='" + caseName + '\'' +
                ", layoutId=" + layoutId +
                ", isTemplate=" + isTemplate +
                '}';
    }
}
