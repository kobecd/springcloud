package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;

import com.rongyi.easy.smart.vo.CaseLayerVO;
/**
 * 素材贴纸模板VO
 * @author user
 *
 */
public class StickerVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String positionLeft;//左边距
	private String positionUp;//上边距
	private String with;//宽度
	private String height;//高度
	private String type;//1: 图片 ,2文字
	private String text;//文字内容
	private String textSize;//文字大小
	private String textColor;//文字颜色
	private String textLineSpace;//行间距
	private String textLetterSpacing;//字间距
	private Boolean textBold;//是否加粗
	private Boolean textUnderLine;//是否有下划线
	private String textAlign;//对齐方式 1：左对齐 2：居中对齐 3：右对齐
	private String textFont;//字体选择
	private String resource;//资源路径
	private String localresource;//本地资源路径
	private int sort;//排序
	private Boolean textShadow;//是否有阴影
	private String textAlpha;//文字透明度
	
	private Boolean textItalic;//是否斜体
	
	public StickerVO() {
		
	}
	
	public String getPositionLeft() {
		return positionLeft;
	}
	public void setPositionLeft(String positionLeft) {
		this.positionLeft = positionLeft;
	}
	public String getPositionUp() {
		return positionUp;
	}
	public void setPositionUp(String positionUp) {
		this.positionUp = positionUp;
	}
	public String getWith() {
		return with;
	}
	public void setWith(String with) {
		this.with = with;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTextSize() {
		return textSize;
	}
	public void setTextSize(String textSize) {
		this.textSize = textSize;
	}
	public String getTextColor() {
		return textColor;
	}
	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}
	public String getTextLineSpace() {
		return textLineSpace;
	}
	public void setTextLineSpace(String textLineSpace) {
		this.textLineSpace = textLineSpace;
	}
	public String getTextLetterSpacing() {
		return textLetterSpacing;
	}
	public void setTextLetterSpacing(String textLetterSpacing) {
		this.textLetterSpacing = textLetterSpacing;
	}
	public Boolean getTextBold() {
		return textBold;
	}
	public void setTextBold(Boolean textBold) {
		this.textBold = textBold;
	}
	public Boolean getTextUnderLine() {
		return textUnderLine;
	}
	public void setTextUnderLine(Boolean textUnderLine) {
		this.textUnderLine = textUnderLine;
	}
	public String getTextAlign() {
		return textAlign;
	}
	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
	}
	public String getTextFont() {
		return textFont;
	}
	public void setTextFont(String textFont) {
		this.textFont = textFont;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getLocalresource() {
		return localresource;
	}
	public void setLocalresource(String localresource) {
		this.localresource = localresource;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public Boolean getTextShadow() {
		return textShadow;
	}

	public void setTextShadow(Boolean textShadow) {
		this.textShadow = textShadow;
	}

	public String getTextAlpha() {
		return textAlpha;
	}

	public void setTextAlpha(String textAlpha) {
		this.textAlpha = textAlpha;
	}
	
	public Boolean getTextItalic() {
		return textItalic;
	}

	public void setTextItalic(Boolean textItalic) {
		this.textItalic = textItalic;
	}

	@Override
	public String toString() {
		return "StickerVO [positionLeft=" + positionLeft + ", positionUp="
				+ positionUp + ", with=" + with + ", height=" + height
				+ ", type=" + type + ", text=" + text + ", textSize="
				+ textSize + ", textColor=" + textColor + ", textLineSpace="
				+ textLineSpace + ", textLetterSpacing=" + textLetterSpacing
				+ ", textBold=" + textBold + ", textUnderLine=" + textUnderLine
				+ ", textAlign=" + textAlign + ", textFont=" + textFont
				+ ", resource=" + resource + ", localresource=" + localresource
				+ ", sort=" + sort + ", textShadow=" + textShadow
				+ ", textAlpha=" + textAlpha + ", textItalic=" + textItalic
				+ "]";
	}
	
}
