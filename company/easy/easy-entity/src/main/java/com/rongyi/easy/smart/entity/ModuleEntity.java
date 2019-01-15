package com.rongyi.easy.smart.entity;

import java.io.Serializable;

public class ModuleEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String name;

    private String number;
    
    /**
     * 应用模块类型
     */
    private Integer osType;
    
    private String direction;

    private String logo;

    private Integer pid;
    
    private String introduce;

    private String caseUpdateAt;

    private String caseUpdateBy;


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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCaseUpdateAt() {
        return caseUpdateAt;
    }

    public void setCaseUpdateAt(String caseUpdateAt) {
        this.caseUpdateAt = caseUpdateAt;
    }

    public String getCaseUpdateBy() {
        return caseUpdateBy;
    }

    public void setCaseUpdateBy(String caseUpdateBy) {
        this.caseUpdateBy = caseUpdateBy;
    }

	public Integer getOsType() {
		return osType;
	}

	public void setOsType(Integer osType) {
		this.osType = osType;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	public String toString() {
		return "ModuleEntity [id=" + id + ", name=" + name + ", number="
				+ number + ", osType=" + osType + ", direction=" + direction
				+ ", logo=" + logo + ", pid=" + pid + ", introduce="
				+ introduce + ", caseUpdateAt=" + caseUpdateAt
				+ ", caseUpdateBy=" + caseUpdateBy + "]";
	}
	
}