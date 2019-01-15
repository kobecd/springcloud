package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 贴纸模板VO
 * @author user
 *
 */
public class TagModuleVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;//模板表ID

    private String mallId;//商场id

    private String name;//模板名称

    private String direction;//版式
    
    private Integer status;//状态 0: 未使用 1：部署中 2：已使用 3：删除
    
    private String resolution;//分辨率

    private Integer releaseState;//发布状态， 0 未发布， 1 已发布（未发布的不准关联设备）

    private Integer releaseAt;//发布时间
    
    private Integer style;//模板类型: 1 标准版， 2 简易模板（易拉宝）， 3 自定义模板（电子易拉宝）, 4 贴纸模板
    
    private List<CaseLayerVO> caseLayers;
    
    private Integer createAt;//创建时间
    
    private String createBy;//创建人
    
    private String createTimeStr;//创建时间  格式yyyy-MM-dd HH:mm:ss
    
    private String releaseTimeStr;//发布时间  格式yyyy-MM-dd HH:mm:ss

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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Integer getReleaseState() {
		return releaseState;
	}

	public void setReleaseState(Integer releaseState) {
		this.releaseState = releaseState;
	}

	public Integer getReleaseAt() {
		return releaseAt;
	}

	public void setReleaseAt(Integer releaseAt) {
		this.releaseAt = releaseAt;
	}

	public Integer getStyle() {
		return style;
	}

	public void setStyle(Integer style) {
		this.style = style;
	}

	public List<CaseLayerVO> getCaseLayers() {
		return caseLayers;
	}

	public void setCaseLayers(List<CaseLayerVO> caseLayers) {
		this.caseLayers = caseLayers;
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

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getReleaseTimeStr() {
		return releaseTimeStr;
	}

	public void setReleaseTimeStr(String releaseTimeStr) {
		this.releaseTimeStr = releaseTimeStr;
	}

	@Override
	public String toString() {
		return "TagModuleVO [id=" + id + ", mallId=" + mallId + ", name="
				+ name + ", direction=" + direction + ", status=" + status
				+ ", resolution=" + resolution + ", releaseState="
				+ releaseState + ", releaseAt=" + releaseAt + ", style="
				+ style + ", caseLayers=" + caseLayers + ", createAt="
				+ createAt + ", createBy=" + createBy + ", createTimeStr="
				+ createTimeStr + ", releaseTimeStr=" + releaseTimeStr + "]";
	}
	
}
