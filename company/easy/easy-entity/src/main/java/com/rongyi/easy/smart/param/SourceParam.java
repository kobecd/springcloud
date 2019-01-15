package com.rongyi.easy.smart.param;

import java.util.List;

/**
 * Created by yandong on 2017/10/16.
 */
public class SourceParam extends BaseParam{


    private String name;
    private String fullName;//全匹配时使用
    private Integer type;
    private String mallId;
    private Integer state ;
    private Integer caseId;
    private Integer isDefault;
    private Integer sourceId;
    private Integer groupId;
    private List<Integer> sourceIdList;
    private String token;//查询进度token
    private Integer isPublic;
    private Integer deleteCheckTag;
    /**
     * 请求来源 1 大运营，2 商家后台
     */
    private Integer from;//请求来源 1 大运营，2 商家后台
    
    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Integer> getSourceIdList() {
        return sourceIdList;
    }

    public void setSourceIdList(List<Integer> sourceIdList) {
        this.sourceIdList = sourceIdList;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }


    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getDeleteCheckTag() {
        return deleteCheckTag;
    }

    public void setDeleteCheckTag(Integer deleteCheckTag) {
        this.deleteCheckTag = deleteCheckTag;
    }

    public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}

    @Override
    public String toString() {
        return "SourceParam{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", type=" + type +
                ", mallId='" + mallId + '\'' +
                ", state=" + state +
                ", caseId=" + caseId +
                ", isDefault=" + isDefault +
                ", sourceId=" + sourceId +
                ", groupId=" + groupId +
                ", sourceIdList=" + sourceIdList +
                ", token='" + token + '\'' +
                ", isPublic=" + isPublic +
                ", deleteCheckTag=" + deleteCheckTag +
                ", from=" + from +
                '}';
    }

}
