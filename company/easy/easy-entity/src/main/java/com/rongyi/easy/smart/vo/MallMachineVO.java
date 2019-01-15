package com.rongyi.easy.smart.vo;

import java.io.Serializable;


/**
 * 大运营版本监控列表查看机器部署状态返回VO
 * @author user
 *
 */
public class MallMachineVO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String mallId;//商场id
	private String terminalCode;//设备编号
	private String floorId;//楼层id
	private String floorName;//楼层名
	private String point;//点位
	private String version;//版本号
	private String updateAt;//更新时间
	private Integer status;//状态
	
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "MallMachineVO [mallId=" + mallId + ", terminalCode="
				+ terminalCode + ", floorId=" + floorId + ", floorName="
				+ floorName + ", point=" + point + ", version=" + version
				+ ", updateAt=" + updateAt + ", status=" + status + "]";
	}
	
}
