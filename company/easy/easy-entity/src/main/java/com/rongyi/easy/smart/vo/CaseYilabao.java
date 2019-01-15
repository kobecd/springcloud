package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yandong on 2017/10/17.
 */
public class CaseYilabao implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//模板ID
    private String name;//模板名称
    private Integer machineNum;//关联的设备数量
    private String updateBy;//修改人账号
    private Integer updateAt;//修改时间  时间戳
    private Integer createAt;//创建时间  时间戳
    private String createBy;//创建人账号
    private String resolution;//分辨率
    private String  layoutNumber;//
    private Integer layoutId;//应用ID
    private String preview;//预览图
    private Integer isTemplate;//是否共用模板  1是，0否
    private Integer style;//模板类型:1 标准版,2 简易模板（易拉宝）,3 自定义模板（电子易拉宝）,4 贴纸模板,5 广告模板
    private Integer templateId;//如果是根据共有模板创建，对应的共有模板的id
    private Integer releaseState;//发布状态:0 未发布， 1 已发布
    private Integer releaseAt;//发布时间
    private String direction;//版式
    private List<String> categoryNameList;//模板关联的类目名称集合

    public Integer getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Integer isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public String getLayoutNumber() {
        return layoutNumber;
    }

    public void setLayoutNumber(String layoutNumber) {
        this.layoutNumber = layoutNumber;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMachineNum() {
        return machineNum;
    }

    public void setMachineNum(Integer machineNum) {
        this.machineNum = machineNum;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(Integer releaseState) {
        this.releaseState = releaseState;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Integer getReleaseAt() {
        return releaseAt;
    }

    public void setReleaseAt(Integer releaseAt) {
        this.releaseAt = releaseAt;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    

	public List<String> getCategoryNameList() {
		return categoryNameList;
	}

	public void setCategoryNameList(List<String> categoryNameList) {
		this.categoryNameList = categoryNameList;
	}

	@Override
	public String toString() {
		return "CaseYilabao [id=" + id + ", name=" + name + ", machineNum="
				+ machineNum + ", updateBy=" + updateBy + ", updateAt="
				+ updateAt + ", createAt=" + createAt + ", createBy="
				+ createBy + ", resolution=" + resolution + ", layoutNumber="
				+ layoutNumber + ", layoutId=" + layoutId + ", preview="
				+ preview + ", isTemplate=" + isTemplate + ", style=" + style
				+ ", templateId=" + templateId + ", releaseState="
				+ releaseState + ", releaseAt=" + releaseAt + ", direction="
				+ direction + ", categoryNameList=" + categoryNameList + "]";
	}
	
}
