package com.rongyi.easy.smart.param;

import java.io.Serializable;

/**
 * 打数据包参数
 * @author user
 *
 */
public class DataPacketParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId;//商场id
	private boolean hasAd;//是否包含广告
	private String remark;//备注
	private String createBy;//创建人
	private Integer version;//版本号
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public boolean isHasAd() {
		return hasAd;
	}
	public void setHasAd(boolean hasAd) {
		this.hasAd = hasAd;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "DataPacketParam [mallId=" + mallId + ", hasAd=" + hasAd
				+ ", remark=" + remark + ", createBy=" + createBy
				+ ", version=" + version + "]";
	}
	
}
