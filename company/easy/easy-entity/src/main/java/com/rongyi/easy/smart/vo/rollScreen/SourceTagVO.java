package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;
import java.util.List;
/**
 * 素材贴纸信息VO
 * @author user
 *
 */
public class SourceTagVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer top;//上边距

    private Integer left;//左边距

    private Integer width;//宽

    private Integer height;//高
    
    private List<StickerVO> sticker;//图层集合

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

	public List<StickerVO> getSticker() {
		return sticker;
	}

	public void setSticker(List<StickerVO> sticker) {
		this.sticker = sticker;
	}

	@Override
	public String toString() {
		return "SourceTagVO [top=" + top + ", left=" + left + ", width="
				+ width + ", height=" + height + ", sticker=" + sticker + "]";
	}
	
}
