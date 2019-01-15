package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/**
 * 监控机器列表返回VO
 * @author user
 *
 */
public class MonitorMachineVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String mallId;
	private String terminalCode;
	private String floorId;
	private String floorName;
	private String point;//点位
	private Integer status;//机器部署状态
	private String updateAt;//更新时间
	private String version;//业务APK版本号
	private Integer osType;//系统类型

	
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
	public String getTerminalCode() {
		return terminalCode;
	}
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}
	public String getFloorId() {
		return floorId;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getOsType() {
		return osType;
	}

	public void setOsType(Integer osType) {
		this.osType = osType;
	}

	@Override
	public String toString() {
		return "MonitorMachineVO [id=" + id + ", mallId=" + mallId
				+ ", terminalCode=" + terminalCode + ", floorId=" + floorId
				+ ", floorName=" + floorName + ", point=" + point + ", status="
				+ status + ", updateAt=" + updateAt + ", version=" + version
				+ "]";
	}
	
}
