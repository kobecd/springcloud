package com.rongyi.easy.smart.entity;

import java.io.Serializable;

public class CaseEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;//模板表ID

    private String mallId;//商场id

    private String name;//模板名称

    private String direction;//版式

    private String layoutName;

    private Integer layoutId;

    private String preview;//预览图

    private Byte status;//状态 0: 未使用 1：部署中 2：已使用 3：删除

    private Byte updating;//是否有更新 0:无 1:有

    private String createBy;

    private String updateBy;

    private Integer createAt;

    private Integer updateAt;

    private String resolution;//分辨率

    private Integer releaseState;//发布状态， 0 未发布， 1 已发布（未发布的不准关联设备）

    private Integer releaseAt;//发布时间

    private Integer style;//样式， 1 标准版

    private Integer isTemplate;//是否是公用模板， 1 是， 0 不是

    private Integer templateId;//如果是根据共有模板创建，对应的共有模板的id

    private Long mcpCaseId;//对应的商场定制版的作品ID

    private Integer gameBoxCaseId;//对应游戏盒子关联id

    public Integer getGameBoxCaseId() {
        return gameBoxCaseId;
    }

    public void setGameBoxCaseId(Integer gameBoxCaseId) {
        this.gameBoxCaseId = gameBoxCaseId;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Integer getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(Integer releaseState) {
        this.releaseState = releaseState;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLayoutName() {
        return layoutName;
    }

    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getUpdating() {
        return updating;
    }

    public void setUpdating(Byte updating) {
        this.updating = updating;
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

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Integer getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Integer isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getReleaseAt() {
        return releaseAt;
    }

    public void setReleaseAt(Integer releaseAt) {
        this.releaseAt = releaseAt;
    }

	public Long getMcpCaseId() {
		return mcpCaseId;
	}

	public void setMcpCaseId(Long mcpCaseId) {
		this.mcpCaseId = mcpCaseId;
	}

	@Override
	public String toString() {
		return "CaseEntity [id=" + id + ", mallId=" + mallId + ", name=" + name
				+ ", direction=" + direction + ", layoutName=" + layoutName
				+ ", layoutId=" + layoutId + ", preview=" + preview
				+ ", status=" + status + ", updating=" + updating
				+ ", createBy=" + createBy + ", updateBy=" + updateBy
				+ ", createAt=" + createAt + ", updateAt=" + updateAt
				+ ", resolution=" + resolution + ", releaseState="
				+ releaseState + ", releaseAt=" + releaseAt + ", style="
				+ style + ", isTemplate=" + isTemplate + ", templateId="
				+ templateId + ", mcpCaseId=" + mcpCaseId + ", gameBoxCaseId="
				+ gameBoxCaseId + "]";
	}
	
}