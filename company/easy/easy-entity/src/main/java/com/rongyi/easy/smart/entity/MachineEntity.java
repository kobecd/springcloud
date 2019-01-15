package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.Date;

public class MachineEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String code;

    private String name;

    private String address;

    private String state;

    private String remarks;
    
    private Integer caseId;//商家后台模板id
    
    private String appId;//默认启动业务APP应用

    private Long lastHeartTime;

    private String mac;
    
    private Integer createAt;
    
    private Integer updateAt;

    private String floorId;


    
    //ADD 2018/01/25
    private Integer machineOwnerId;//设备主ID
    private Integer bannerPlay;//广告播放  1是，0否
    private String wide;//屏幕宽
    private String high;//屏幕高
    private Date enterTime;//入场时间
    
    private String codeId;//流水号
    private String createBy;//创建人
    private String updateBy;//修改人
    private String screenPixels;

    private Integer osType;//系统类型 1 android, 2 windows

    public Integer getOsType() {
        return osType;
    }

    public void setOsType(Integer osType) {
        this.osType = osType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getLastHeartTime() {
        return lastHeartTime;
    }

    public void setLastHeartTime(Long lastHeartTime) {
        this.lastHeartTime = lastHeartTime;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
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

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

	public Integer getMachineOwnerId() {
		return machineOwnerId;
	}

	public void setMachineOwnerId(Integer machineOwnerId) {
		this.machineOwnerId = machineOwnerId;
	}

	public Integer getBannerPlay() {
		return bannerPlay;
	}

	public void setBannerPlay(Integer bannerPlay) {
		this.bannerPlay = bannerPlay;
	}

	public String getWide() {
		return wide;
	}

	public void setWide(String wide) {
		this.wide = wide;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public Date getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
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
	
    public String getScreenPixels() { 
    	return screenPixels; 
    }

    public void setScreenPixels(String screenPixels) {
        this.screenPixels = screenPixels;
    }

    @Override
    public String toString() {
        return "MachineEntity{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", remarks='" + remarks + '\'' +
                ", caseId=" + caseId +
                ", appId='" + appId + '\'' +
                ", lastHeartTime=" + lastHeartTime +
                ", mac='" + mac + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", floorId='" + floorId + '\'' +
                ", machineOwnerId=" + machineOwnerId +
                ", bannerPlay=" + bannerPlay +
                ", wide='" + wide + '\'' +
                ", high='" + high + '\'' +
                ", enterTime=" + enterTime +
                ", codeId='" + codeId + '\'' +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", screenPixels='" + screenPixels + '\'' +
                '}';
    }
}
