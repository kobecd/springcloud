package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;

/**
 * 
 * @ClassName     MemberQRCodeParam.java 
 * @Description   TODO 会员二维码PARAM
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月26日 下午10:28:39
 */
@SuppressWarnings("serial")
public class MemberQRCodeParam implements Serializable{
	private String actionName;
	private String expireSeconds;
	private String from;
	private String mallId;
	private String resourceId;
	private String resourceKey;
	private String resourceType;
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public String getExpireSeconds() {
		return expireSeconds;
	}
	public void setExpireSeconds(String expireSeconds) {
		this.expireSeconds = expireSeconds;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceKey() {
		return resourceKey;
	}
	public void setResourceKey(String resourceKey) {
		this.resourceKey = resourceKey;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	@Override
	public String toString() {
		return "MemberQRCodeParam [actionName=" + actionName + ", expireSeconds=" + expireSeconds + ", from=" + from
				+ ", mallId=" + mallId + ", resourceId=" + resourceId + ", resourceKey=" + resourceKey
				+ ", resourceType=" + resourceType + "]";
	}
	
	

}
