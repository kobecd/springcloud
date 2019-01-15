package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.Date;

public class AppVersionEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String version;//版本号 （String）
    
    private Integer versionCode;//版本号 （int）
    
    private String baseVersion;//基础服务版本号
    
    private String appId;

    private String name;

    private Integer type;

    private String packUrl;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;
    
    private Integer status;//状态 0:未发布,1:试点发布,2:全发布,3:删除

    private Integer deployStatus;//打包状态 0:未打包,1:打包中,2:打包完成,3:打包失败
    
    private Integer osType;//系统类型 1 安卓，2 windows
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPackUrl() {
        return packUrl;
    }

    public void setPackUrl(String packUrl) {
        this.packUrl = packUrl;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
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

	public Integer getDeployStatus() {
		return deployStatus;
	}

	public void setDeployStatus(Integer deployStatus) {
		this.deployStatus = deployStatus;
	}

	public String getBaseVersion() {
		return baseVersion;
	}

	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
	}

	public Integer getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}

	public Integer getOsType() {
		return osType;
	}

	public void setOsType(Integer osType) {
		this.osType = osType;
	}

	@Override
	public String toString() {
		return "AppVersionEntity [id=" + id + ", version=" + version
				+ ", versionCode=" + versionCode + ", baseVersion="
				+ baseVersion + ", appId=" + appId + ", name=" + name
				+ ", type=" + type + ", packUrl=" + packUrl + ", createAt="
				+ createAt + ", createBy=" + createBy + ", updateAt="
				+ updateAt + ", updateBy=" + updateBy + ", status=" + status
				+ ", deployStatus=" + deployStatus + ", osType=" + osType + "]";
	}
	
}