package com.rongyi.easy.smart.vo.eShelf;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.smart.entity.AdvertEntity;
/**
 * 电子货架广告数据2.2
 * @author user
 *
 */
public class TemplateAdvertVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;//广告id
	private int type;//类型  1图片，2视频
	private Long startTime;//开始时间
	private Long endTime;//结束时间
	private int duration;//每一张图片轮播时间单位秒
	private String adName;//广告名称
    private String adOwner;//广告主
    private String adType;//广告类型 1:内部广告,2:外部广告
	private List<String> resource;
	private List<String> localResource;
	private List<String> landscapeResource;
	private List<String> landscapeLocalResource;
	private List<Object> resourceLink;
	
	public TemplateAdvertVO() {
		
	}
	
	public TemplateAdvertVO(AdvertEntity entity) {
		this.id = entity.getId() + "";
		this.adName = entity.getName();
		this.adOwner = "";
		if(entity.getType().equals(1)){
			this.adType = "1";
		}else{
			this.adType = "2";
		}
		
		this.type = entity.getAdStyle();
		this.duration = entity.getBroadcastTime();
		if(entity.getStartAt() != null){
			this.startTime = entity.getStartAt().getTime()/1000;
		}
		
		if(entity.getEndAt() != null){
			this.endTime = entity.getEndAt().getTime()/1000;
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Long getStartTime() {
		return startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	public Long getEndTime() {
		return endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getAdOwner() {
		return adOwner;
	}

	public void setAdOwner(String adOwner) {
		this.adOwner = adOwner;
	}

	public String getAdType() {
		return adType;
	}

	public void setAdType(String adType) {
		this.adType = adType;
	}

	public List<String> getResource() {
		return resource;
	}
	public void setResource(List<String> resource) {
		this.resource = resource;
	}
	public List<String> getLocalResource() {
		return localResource;
	}
	public void setLocalResource(List<String> localResource) {
		this.localResource = localResource;
	}

	public List<String> getLandscapeResource() {
		return landscapeResource;
	}

	public void setLandscapeResource(List<String> landscapeResource) {
		this.landscapeResource = landscapeResource;
	}

	public List<String> getLandscapeLocalResource() {
		return landscapeLocalResource;
	}

	public void setLandscapeLocalResource(List<String> landscapeLocalResource) {
		this.landscapeLocalResource = landscapeLocalResource;
	}

	public List<Object> getResourceLink() {
		return resourceLink;
	}

	public void setResourceLink(List<Object> resourceLink) {
		this.resourceLink = resourceLink;
	}

	@Override
	public String toString() {
		return "TemplateAdvertVO{" +
				"id='" + id + '\'' +
				", type=" + type +
				", startTime=" + startTime +
				", endTime=" + endTime +
				", duration=" + duration +
				", adName='" + adName + '\'' +
				", adOwner='" + adOwner + '\'' +
				", adType='" + adType + '\'' +
				", resource=" + resource +
				", localResource=" + localResource +
				", landscapeResource=" + landscapeResource +
				", landscapeLocalResource=" + landscapeLocalResource +
				", resourceLink=" + resourceLink +
				'}';
	}

}
