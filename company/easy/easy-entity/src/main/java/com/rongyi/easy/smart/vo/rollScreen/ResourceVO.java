package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;

public class ResourceVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 资源路径
	 */
	private String resource;
	/**
	 * 资源名称
	 */
	private String resourceName;
	/**
	 * 开始时间
	 */
	private long startTime;
	/**
	 * 结束时间
	 */
	private long endTime;
	/**
	 * 资源类型   1为图片 2为视频
	 */
	private String resourceType;
	
	/**
	 * 贴纸模板信息
	 */
	private SourceTagVO sourceTag;
	/**
	 * 素材宽
	 */
	private Integer resourceWidth;
	/**
	 * 素材高
	 */
	private Integer resourceHeight;

	/**
	 * 素材播放时长
	 */
	private Integer interval;
	
	
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public SourceTagVO getSourceTag() {
		return sourceTag;
	}
	public void setSourceTag(SourceTagVO sourceTag) {
		this.sourceTag = sourceTag;
	}
	public Integer getResourceWidth() {
		return resourceWidth;
	}
	public void setResourceWidth(Integer resourceWidth) {
		this.resourceWidth = resourceWidth;
	}
	public Integer getResourceHeight() {
		return resourceHeight;
	}
	public void setResourceHeight(Integer resourceHeight) {
		this.resourceHeight = resourceHeight;
	}

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	@Override
	public String toString() {
		return "ResourceVO{" +
				"resource='" + resource + '\'' +
				", resourceName='" + resourceName + '\'' +
				", startTime=" + startTime +
				", endTime=" + endTime +
				", resourceType='" + resourceType + '\'' +
				", sourceTag=" + sourceTag +
				", resourceWidth=" + resourceWidth +
				", resourceHeight=" + resourceHeight +
				", interval=" + interval +
				'}';
	}


}
