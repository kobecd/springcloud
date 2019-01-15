package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.bdata.dto.CustomCategoryDto;
import com.rongyi.easy.bdata.vo.BrandVO;

public class ShopVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * 店铺LOGO
     */
    private String logo;

    /**
     * 店铺LOGO本地路径
     */
    private String localLogo;

    /**
     * 店铺中文名称
     */
    private String name;

    /**
     * 店铺英文名称
     */
    private String enName;

    /**
     * 店铺中文名称拼音首字母 用于字母和数字查找
     */
    private String namePrefix;

    /**
     * 店铺英文名称首字母 用于字母和数字查找
     */
    private String enNamePrefix;

    /**
     * 店铺描述信息
     */
    private String description;

    /**
     * 店铺位置描述 （楼层+铺位号）
     */
    private String locationDec;

    /**
     * 楼层ID
     */
    private String floorId;

    /**
     * 店铺联系方式
     */
    private String contact;

    /**
     * 店铺分类的信息
     */
    private List<CategoryVO> categories;

    /**
     * 店铺在图片中的X轴值
     */
    private long locationX;

    /**
     * 店铺在图片中的Y轴值
     */
    private long locationY;

    /**
     * 店铺地址
     */
    private String address;

    /**
     * 店铺在线图片资源地址
     */
    private List<String> pictures;

    /**
     * 店铺本地图片资源相对路径
     */
    private List<String> localPictures;
    /**
     * 排序字段
     */
    private Integer sort;//
    /**
     * 店铺id
     */
    private String id;
    /**
     * 铺位号
     */
    private String berthNumber;
    
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLocalLogo() {
		return localLogo;
	}

	public void setLocalLogo(String localLogo) {
		this.localLogo = localLogo;
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

	public String getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getEnNamePrefix() {
		return enNamePrefix;
	}

	public void setEnNamePrefix(String enNamePrefix) {
		this.enNamePrefix = enNamePrefix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocationDec() {
		return locationDec;
	}

	public void setLocationDec(String locationDec) {
		this.locationDec = locationDec;
	}

	public String getFloorId() {
		return floorId;
	}

	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public List<CategoryVO> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryVO> categories) {
		this.categories = categories;
	}

	public long getLocationX() {
		return locationX;
	}

	public void setLocationX(long locationX) {
		this.locationX = locationX;
	}

	public long getLocationY() {
		return locationY;
	}

	public void setLocationY(long locationY) {
		this.locationY = locationY;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getPictures() {
		return pictures;
	}

	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}

	public List<String> getLocalPictures() {
		return localPictures;
	}

	public void setLocalPictures(List<String> localPictures) {
		this.localPictures = localPictures;
	}
	
	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBerthNumber() {
		return berthNumber;
	}

	public void setBerthNumber(String berthNumber) {
		this.berthNumber = berthNumber;
	}

	@Override
	public String toString() {
		return "ShopVO [logo=" + logo + ", localLogo=" + localLogo + ", name="
				+ name + ", enName=" + enName + ", namePrefix=" + namePrefix
				+ ", enNamePrefix=" + enNamePrefix + ", description="
				+ description + ", locationDec=" + locationDec + ", floorId="
				+ floorId + ", contact=" + contact + ", categories="
				+ categories + ", locationX=" + locationX + ", locationY="
				+ locationY + ", address=" + address + ", pictures=" + pictures
				+ ", localPictures=" + localPictures + ", sort=" + sort
				+ ", id=" + id + ", berthNumber=" + berthNumber + "]";
	}
	
}
