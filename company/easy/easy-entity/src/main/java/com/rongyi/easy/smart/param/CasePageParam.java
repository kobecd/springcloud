package com.rongyi.easy.smart.param;

/**
 * Created by yandong on 2017/10/20.
 */
public class CasePageParam extends BaseParam {

    private Integer layoutId;

    private Integer pageId;

    private Integer isTemplate;

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public Integer getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Integer isTemplate) {
        this.isTemplate = isTemplate;
    }

    @Override
    public String toString() {
        return "CasePageParam{" +
                "layoutId=" + layoutId +
                ", pageId=" + pageId +
                ", isTemplate=" + isTemplate +
                "} " + super.toString();
    }
}
