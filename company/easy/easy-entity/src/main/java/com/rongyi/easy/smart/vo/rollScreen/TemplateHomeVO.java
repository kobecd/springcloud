package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;
import java.util.List;
/**
 * 电子易拉宝 首页数据VO
 * @author user
 *
 */
public class TemplateHomeVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;//视图id
	private String positionLeft;//视图离左边距离
	private String positionUp;//视图离顶部距离
	private String with;//视图的宽度
	private String height;//视图的高度
	private String type;//视图类型:1 图片/视频,3 flash,4 时间和日期,5 外链url
	private String deepColor;
	private String lightColor;
	private String weatherType;
	private String timeFormat;//时间格式
	private String dateFormat;//日期格式
	private Boolean is24Hour;
	private String time;//图片轮播时间
	private int sort;//排序
	private List<ResourceVO> resource;//资源路径   根据type=1图片，2视频，5 网络url, 6文字
	private List<ResourceVO> localResource;
	
	/** 
	 * 视频是否有声音  0:静音 1：有声    [当资源为图片时，此值为空]
	 */
	private String voice;
	private String text;//文字
	private String textSize;//文字大小
	private String textColor;//文字颜色
	//add by 20180327
	private String textLineSpace;//行间距
	private String textLetterSpacing;//字间距
	private Boolean textBold;//是否加粗
	private Boolean textUnderLine;//是否有下划线
	private String textAlign;//对齐方式 1：左对齐 2：居中对齐 3：右对齐
	private String textFont;//字体选择    1: 安卓默认字体 2：濑户字体 3：站酷高端黑 4：站酷酷黑 5：站酷快乐体 6：站酷意大利体
	private String playEffect;//轮播效果 1:soft scale(淡出) 2:fortune wheel(横向旋转) 3:swipe(向上擦除) 4:push reveal(下拉展示) 5:stick it(翻页)
	private Boolean transparent;//是否透明底
	private Boolean textShadow;//是否显示阴影
	private String textAlpha;//文字透明度
	private Boolean textItalic;//是否斜体
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getDeepColor() {
		return deepColor;
	}
	public void setDeepColor(String deepColor) {
		this.deepColor = deepColor;
	}
	public String getLightColor() {
		return lightColor;
	}
	public void setLightColor(String lightColor) {
		this.lightColor = lightColor;
	}
	public String getWeatherType() {
		return weatherType;
	}
	public void setWeatherType(String weatherType) {
		this.weatherType = weatherType;
	}
	public String getTimeFormat() {
		return timeFormat;
	}
	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	public Boolean getIs24Hour() {
		return is24Hour;
	}
	public void setIs24Hour(Boolean is24Hour) {
		this.is24Hour = is24Hour;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public List<ResourceVO> getResource() {
		return resource;
	}
	public void setResource(List<ResourceVO> resource) {
		this.resource = resource;
	}
	public List<ResourceVO> getLocalResource() {
		return localResource;
	}
	public void setLocalResource(List<ResourceVO> localResource) {
		this.localResource = localResource;
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
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
	public String getPlayEffect() {
		return playEffect;
	}
	public void setPlayEffect(String playEffect) {
		this.playEffect = playEffect;
	}
	public Boolean getTransparent() {
		return transparent;
	}
	public void setTransparent(Boolean transparent) {
		this.transparent = transparent;
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
		return "TemplateHomeVO [id=" + id + ", positionLeft=" + positionLeft
				+ ", positionUp=" + positionUp + ", with=" + with + ", height="
				+ height + ", type=" + type + ", deepColor=" + deepColor
				+ ", lightColor=" + lightColor + ", weatherType=" + weatherType
				+ ", timeFormat=" + timeFormat + ", dateFormat=" + dateFormat
				+ ", is24Hour=" + is24Hour + ", time=" + time + ", sort="
				+ sort + ", resource=" + resource + ", localResource="
				+ localResource + ", voice=" + voice + ", text=" + text
				+ ", textSize=" + textSize + ", textColor=" + textColor
				+ ", textLineSpace=" + textLineSpace + ", textLetterSpacing="
				+ textLetterSpacing + ", textBold=" + textBold
				+ ", textUnderLine=" + textUnderLine + ", textAlign="
				+ textAlign + ", textFont=" + textFont + ", playEffect="
				+ playEffect + ", transparent=" + transparent + ", textShadow="
				+ textShadow + ", textAlpha=" + textAlpha + ", textItalic="
				+ textItalic + "]";
	}
	
}
