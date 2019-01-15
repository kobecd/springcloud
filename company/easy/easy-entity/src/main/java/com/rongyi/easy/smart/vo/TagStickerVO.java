package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 素材贴纸信息VO
 */
public class TagStickerVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer top;//上边距

    private Integer left;//左边距

    private Integer width;//宽

    private Integer height;//高
    
    private List<CaseLayerVO> layerList;//图层集合

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	public Integer getLeft() {
		return left;
	}

	public void setLeft(Integer left) {
		this.left = left;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public List<CaseLayerVO> getLayerList() {
		return layerList;
	}

	public void setLayerList(List<CaseLayerVO> layerList) {
		this.layerList = layerList;
	}

	@Override
	public String toString() {
		return "TagStickerVO [top=" + top + ", left=" + left + ", width="
				+ width + ", height=" + height + ", layerList=" + layerList
				+ "]";
	}
    
    
}
