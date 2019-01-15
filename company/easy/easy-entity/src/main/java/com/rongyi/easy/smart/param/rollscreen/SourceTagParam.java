package com.rongyi.easy.smart.param.rollscreen;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.smart.vo.CaseLayerVO;
/**
 * 素材编辑参数
 * @author user
 *
 */
public class SourceTagParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//表ID
	private Integer sourceId;//素材ID
	private Integer tagId;//贴纸模板ID
	
	private Date createAt;//创建时间
	private Date updateAt;//修改时间
	private String createBy;//创建人
	private String updateBy;//修改人
	
	private String mallId;//商场ID
	private String sourceName;//素材名称
	
	//图层列表
	private List<CaseLayerVO> caseLayers;
	private Integer top;
	private Integer left;

	private Integer width;
	private Integer height;
	/**
	 * 素材坐标 上边距
	 */
	private Integer sourceTop;
	/**
	 * 素材坐标 左边距
	 */
	private Integer sourceLeft;
	/**
	 * 素材坐标  高
	 */
	private Integer sourceHeight;
	/**
	 * 素材坐标  宽
	 */
	private Integer sourceWidth;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSourceId() {
		return sourceId;
	}
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public List<CaseLayerVO> getCaseLayers() {
		return caseLayers;
	}
	public void setCaseLayers(List<CaseLayerVO> caseLayers) {
		this.caseLayers = caseLayers;
	}
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
	public Integer getSourceHeight() {
		return sourceHeight;
	}
	public void setSourceHeight(Integer sourceHeight) {
		this.sourceHeight = sourceHeight;
	}
	public Integer getSourceWidth() {
		return sourceWidth;
	}
	public void setSourceWidth(Integer sourceWidth) {
		this.sourceWidth = sourceWidth;
	}
	@Override
	public String toString() {
		return "SourceTagParam [id=" + id + ", sourceId=" + sourceId
				+ ", tagId=" + tagId + ", createAt=" + createAt + ", updateAt="
				+ updateAt + ", createBy=" + createBy + ", updateBy="
				+ updateBy + ", mallId=" + mallId + ", sourceName="
				+ sourceName + ", caseLayers=" + caseLayers + ", top=" + top
				+ ", left=" + left + ", width=" + width + ", height=" + height
				+ ", sourceTop=" + sourceTop + ", sourceLeft=" + sourceLeft
				+ ", sourceHeight=" + sourceHeight + ", sourceWidth="
				+ sourceWidth + "]";
	}
	
}
