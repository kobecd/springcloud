package com.rongyi.easy.smart.vo;

import com.rongyi.easy.smart.entity.Commodity;

import java.util.Date;
import java.util.List;

/**
 * Created by yandong on 2017/11/13.
 */
public class CommodityVO extends Commodity {

    private String sourceUrl;//对应的商品图片url
    private String originalPrice;//原价
    private String presentPrice;
    private String category;//所属类目
    private List<String> sourceList;
    private String brand;//品牌
    private String stock;//库存
    private String url;//商品url
    private Date grabTime;//抓取时间
    private Integer status; //商品状态
    private Integer terminalType;//显示终端
    private Integer isRelate;//是否关联 1 是， 0 否
    private Date createAt;
    private Integer categoryId;
    
    // add by 20180726
    /**
	 * 落地类型(0:默认,1:外部网页,2:小程序)
	 */
	private Integer landingPageType;

	/**
	 * 落地Url地址
	 */
    private String thirdCommodityUrl;//第三方商品跳转地址

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getIsRelate() {
        return isRelate;
    }

    public void setIsRelate(Integer isRelate) {
        this.isRelate = isRelate;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    private List<Object> specList;

    public List<Object> getSpecList() {
        return specList;
    }

    public void setSpecList(List<Object> specList) {
        this.specList = specList;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getSourceList() {
        return sourceList;
    }

    public void setSourceList(List<String> sourceList) {
        this.sourceList = sourceList;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getGrabTime() {
        return grabTime;
    }

    public void setGrabTime(Date grabTime) {
        this.grabTime = grabTime;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPresentPrice() {
        return presentPrice;
    }

    public void setPresentPrice(String presentPrice) {
        this.presentPrice = presentPrice;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getThirdCommodityUrl() {
		return thirdCommodityUrl;
	}

	public void setThirdCommodityUrl(String thirdCommodityUrl) {
		this.thirdCommodityUrl = thirdCommodityUrl;
	}
	
	public Integer getLandingPageType() {
		return landingPageType;
	}

	public void setLandingPageType(Integer landingPageType) {
		this.landingPageType = landingPageType;
	}

	@Override
	public String toString() {
		return "CommodityVO [sourceUrl=" + sourceUrl + ", originalPrice="
				+ originalPrice + ", presentPrice=" + presentPrice
				+ ", category=" + category + ", sourceList=" + sourceList
				+ ", brand=" + brand + ", stock=" + stock + ", url=" + url
				+ ", grabTime=" + grabTime + ", status=" + status
				+ ", terminalType=" + terminalType + ", isRelate=" + isRelate
				+ ", createAt=" + createAt + ", categoryId=" + categoryId
				+ ", landingPageType=" + landingPageType
				+ ", thirdCommodityUrl=" + thirdCommodityUrl + ", specList="
				+ specList + "]";
	}
}
