package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.Date;

public class SourceTagsRefEntity implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer sourceId;

    private Integer tagsId;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;

    private String detail;
    
    private Integer top;//上边距
    
    private Integer left;//左边距

    private Integer height;

    private Integer width;
    /**
     * 素材坐标  上边距  只作展示用
     */
    private Integer sourceTop;
    /**
     * 素材坐标  左边距  只作展示用
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

    public Integer getTagsId() {
        return tagsId;
    }

    public void setTagsId(Integer tagsId) {
        this.tagsId = tagsId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
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
		return "SourceTagsRefEntity [id=" + id + ", sourceId=" + sourceId
				+ ", tagsId=" + tagsId + ", createAt=" + createAt
				+ ", createBy=" + createBy + ", updateAt=" + updateAt
				+ ", updateBy=" + updateBy + ", detail=" + detail + ", top="
				+ top + ", left=" + left + ", height=" + height + ", width="
				+ width + ", sourceTop=" + sourceTop + ", sourceLeft="
				+ sourceLeft + ", sourceHeight=" + sourceHeight
				+ ", sourceWidth=" + sourceWidth + "]";
	}
}