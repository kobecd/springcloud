package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.mcmc.CommodityTag;

import java.io.Serializable;
import java.util.List;

/**
 * 商品标签对象
 * @author zhengling
 * @date 2017/10/24
 */
public class CommodityTagVO  implements Serializable {

    /**
     * 标签id
     */
    private String id;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 标签图片地址
     */
    private String logoUrl;

    /**
     * 直属父类id
     */
    private String parentId;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 层级，如一级，二级...
     */
    private Integer floor;

    /**
     * 下级子节点
     */
    private List<CommodityTagVO> childList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public List<CommodityTagVO> getChildList() {
        return childList;
    }

    public void setChildList(List<CommodityTagVO> childList) {
        this.childList = childList;
    }

    /**
     * 将CommodityTag对象转为CommodityTagVO对象
     * @param commodityTag  数据库中查询出来的对象
     * @return 返回CommodityTagVO对象
     */
    public static CommodityTagVO transferCommodityTag2VO(CommodityTag commodityTag){
        CommodityTagVO commodityTagVO=new CommodityTagVO();
        commodityTagVO.setFloor(commodityTag.getFloor());
        commodityTagVO.setLogoUrl(commodityTag.getLogoUrl());
        commodityTagVO.setName(commodityTag.getName());
        commodityTagVO.setParentId(commodityTag.getParentId().toString());
        commodityTagVO.setSort(commodityTag.getSort());
        commodityTagVO.setId(commodityTag.getId().toString());
        return commodityTagVO;
    }
}
