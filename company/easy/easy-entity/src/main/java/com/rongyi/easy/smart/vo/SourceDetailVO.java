package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;


/**
 * 素材详情VO
 * @author user
 *
 */
public class SourceDetailVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9208175538130657142L;
	
	private Integer id;//素材表ID
    private String mallId;//商场ID
    private String url;//资源路径
    private String name;//素材名称
    private Integer state;//状态 1 正常， 0 已删除
    private Integer type;//1 图片， 2 视频, 3 flash
    private Integer groupId;//组ID
    private Integer module;//所属模块  1素材 2广告
    private String attribute;//分辨率
	private String preview;
    
    //贴纸模板相关信息
    private Integer tagId;//贴纸模板ID
    private TagStickerVO tagSticker;//贴纸信息
    
    private Integer sourceTop;//素材坐标  上边距
    private Integer sourceLeft;//素材坐标 左边距
    
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public Integer getModule() {
		return module;
	}
	public void setModule(Integer module) {
		this.module = module;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	
	public TagStickerVO getTagSticker() {
		return tagSticker;
	}
	public void setTagSticker(TagStickerVO tagSticker) {
		this.tagSticker = tagSticker;
	}
	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}
	public Integer getSourceTop() {
		return sourceTop;
	}
	public void setSourceTop(Integer sourceTop) {
		this.sourceTop = sourceTop;
	}
	public Integer getSourceLeft() {
		return sourceLeft;
	}
	public void setSourceLeft(Integer sourceLeft) {
		this.sourceLeft = sourceLeft;
	}
	@Override
	public String toString() {
		return "SourceDetailVO [id=" + id + ", mallId=" + mallId + ", url="
				+ url + ", name=" + name + ", state=" + state + ", type="
				+ type + ", groupId=" + groupId + ", module=" + module
				+ ", attribute=" + attribute + ", preview=" + preview
				+ ", tagId=" + tagId + ", tagSticker=" + tagSticker
				+ ", sourceTop=" + sourceTop + ", sourceLeft=" + sourceLeft
				+ "]";
	}
	
}
