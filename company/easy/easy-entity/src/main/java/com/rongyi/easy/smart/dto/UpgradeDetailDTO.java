package com.rongyi.easy.smart.dto;

import java.io.Serializable;

/**
 * 商场定制版数据变更DTO
 * @author user
 *
 */
public class UpgradeDetailDTO implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String mallId;//商场id
    
    /**
     * 应用类型:1,安卓标准版，2,电子易拉宝 3,电子货架，4商场定制版
     * Constant.UpdateApplicationType.ROLL_SCREEN
     */
    private Integer applicationType;

    /**
     * 变更数据类型:1,全局配置 2,常规首页 3,商场导购 4,会员中心 5,精彩活动 6,优惠券 7,商场信息 
     * 8,店铺信息 9,楼层信息 10,公共设施 11,设备模板或者应用变更 12,设备信息变更 
     * 13,店铺分类 14,推荐店铺,17模板变更,18图层控件变更,19广告,20设备排期变更
     */
    private Integer type;//变更数据类型   Constant.UpgradeDetailType.DEVICE_SCHEDULE

    private String changeId;//变更数据类型对应的id

    /**
     * 变更类型:1,新增 2,修改 3,删除
     * Constant.ChangeType.ADD
     */
    private Integer changeType;
    
    private Integer caseId;//设备变更的模板id/作品ID
    
//    private String appId;//设备变更的app_id
//    
//    private Integer scheduleId;//设备排期表ID

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

    public Integer getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(Integer applicationType) {
		this.applicationType = applicationType;
	}

	public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getChangeId() {
        return changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	@Override
	public String toString() {
		return "UpgradeDetailDTO [id=" + id + ", mallId=" + mallId
				+ ", applicationType=" + applicationType + ", type=" + type
				+ ", changeId=" + changeId + ", changeType=" + changeType
				+ ", caseId=" + caseId + "]";
	}
	
}