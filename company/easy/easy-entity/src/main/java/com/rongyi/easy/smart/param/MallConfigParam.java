package com.rongyi.easy.smart.param;

import java.io.Serializable;

/**
 * 商场数据打包 基础数据设备点位信息打包参数类
 * @author user
 *
 */
public class MallConfigParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 商场id
	 */
	private String mallId;
	/**
	 * 安卓应用模板id
	 */
	private Integer androidModuleId;
	/**
	 * 电子易拉宝应用模板id
	 */
	private Integer rollScreenModuleId;
	/**
	 * 电子货架应用模版id
	 */
	private Integer electShelfModuleId;
	/**
	 * 数据包路径
	 */
	private String dataUrl;
	/**
	 * 文件存储路径
	 */
	private String realPath;
	/**
	 * 数据包版本号
	 */
	private int version;
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public Integer getAndroidModuleId() {
		return androidModuleId;
	}
	public void setAndroidModuleId(Integer androidModuleId) {
		this.androidModuleId = androidModuleId;
	}
	public Integer getRollScreenModuleId() {
		return rollScreenModuleId;
	}
	public void setRollScreenModuleId(Integer rollScreenModuleId) {
		this.rollScreenModuleId = rollScreenModuleId;
	}
	public Integer getElectShelfModuleId() {
		return electShelfModuleId;
	}
	public void setElectShelfModuleId(Integer electShelfModuleId) {
		this.electShelfModuleId = electShelfModuleId;
	}
	public String getDataUrl() {
		return dataUrl;
	}
	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}
	public String getRealPath() {
		return realPath;
	}
	public void setRealPath(String realPath) {
		this.realPath = realPath;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "MallConfigParam [mallId=" + mallId + ", androidModuleId="
				+ androidModuleId + ", rollScreenModuleId="
				+ rollScreenModuleId + ", electShelfModuleId="
				+ electShelfModuleId + ", dataUrl=" + dataUrl + ", realPath="
				+ realPath + ", version=" + version + "]";
	}
	
}
