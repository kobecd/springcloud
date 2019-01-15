package com.rongyi.easy.smart.entity;

public class FacilityEntity {
    private Integer id;

    private String mallId;

    private String name;

    private String enName;

    private Boolean status;

    private Integer weight;

    private String createBy;

    private Integer createAt;

    private String updateBy;

    private Integer updateAt;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

	@Override
	public String toString() {
		return "FacilityEntity [id=" + id + ", mallId=" + mallId + ", name="
				+ name + ", enName=" + enName + ", status=" + status
				+ ", weight=" + weight + ", createBy=" + createBy
				+ ", createAt=" + createAt + ", updateBy=" + updateBy
				+ ", updateAt=" + updateAt + "]";
	}
}