package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.smart.entity.AdvertEntity;

public class AdvertVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//广告ID
	private String name;//广告名称
	private Integer adType;//广告展示类型 1:banner,2:其他
	private Integer adStyle;//广告样式 1:图片,2视频
	private String adUrl;//外链地址
	private String startAt;//广告投放时段开始时间
	private String endAt;//广告投放时段结束时间
	private List<String> urls;//素材路径
	private String updateAt;//更新时间
	private String updateBy;//更新人
	private Integer status;//状态 1:正常,0:删除

	
	public AdvertVO() {
		super();
	}
	
	public AdvertVO(AdvertEntity entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.adStyle = entity.getAdStyle();
		this.adType = entity.getAdType();
		this.status = entity.getStatus();
		this.adUrl = entity.getAdUrl();
		if(entity.getUpdateAt() != null){
			this.updateAt = DateUtil.dateToString(entity.getUpdateAt());
		}
		
		this.updateBy = entity.getUpdateBy();
		if(entity.getStartAt() != null){
			this.startAt = DateUtil.dateToString(entity.getStartAt(), "yyyy-MM-dd HH:mm");
		}
		
		if(entity.getEndAt() != null){
			this.endAt = DateUtil.dateToString(entity.getEndAt(), "yyyy-MM-dd HH:mm");
		}
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
	public Integer getAdType() {
		return adType;
	}
	public void setAdType(Integer adType) {
		this.adType = adType;
	}
	public Integer getAdStyle() {
		return adStyle;
	}
	public void setAdStyle(Integer adStyle) {
		this.adStyle = adStyle;
	}
	public String getStartAt() {
		return startAt;
	}
	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}
	public String getEndAt() {
		return endAt;
	}
	public void setEndAt(String endAt) {
		this.endAt = endAt;
	}
	public List<String> getUrls() {
		return urls;
	}
	public void setUrls(List<String> urls) {
		this.urls = urls;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getAdUrl() {
		return adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

	@Override
	public String toString() {
		return "AdvertVO{" +
				"id=" + id +
				", name='" + name + '\'' +
				", adType=" + adType +
				", adStyle=" + adStyle +
				", startAt='" + startAt + '\'' +
				", endAt='" + endAt + '\'' +
				", urls=" + urls +
				", updateAt='" + updateAt + '\'' +
				", updateBy='" + updateBy + '\'' +
				", status=" + status +
				", adUrl='" + adUrl + '\'' +
				'}';
	}

}
