package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.smart.vo.CaseLayerVO;

/**
 * Created by yandong on 2017/10/16.
 */
public class Source implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;  //资源id
    private String mallId;//商场id
    private String url;//资源路径
    private String thumbnail;//缩略图路径
    private String name;//资源名称
    private Integer state;//状态
    private Integer type;//类型  1 图片， 2 视频, 3 GIF图片
    private Integer size;//大小
    private Integer groupId;//组id
    private Integer createAt;
    private Integer updateAt;
    private String createBy;
    private String updateBy;
    private Integer module;
    private String attribute;//分辨率
    private String token; //查询进度使用
    private String format;//资源格式
    private Integer isPublic;//是否默认资源
    private String preview;//视频预览图
    
    //贴纸模板相关信息  20180323
    private Integer tagId;//贴纸模板ID
    private String detail;//文字图层属性
    private List<CaseLayerVO> layerList;//图层集合
    //贴纸所在的位置  上边距
    private Integer top;
    /**
     * 贴纸所在的位置  左边距
     */
    private Integer left;
    /**
     * 贴纸所在的位置  宽
     */
    private Integer width;
    /**
     * 贴纸所在的位置  高
     */
    private Integer height;
    //展示使用
    private Integer sourceTop;
    //展示使用
    private Integer sourceLeft;

    /**
     * 视频原始尺寸预览图
     * @return
     */
    private String originalSizePreview;
    
    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Integer getModule() {
        return module;
    }

    public void setModule(Integer module) {
        this.module = module;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
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

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public List<CaseLayerVO> getLayerList() {
		return layerList;
	}

	public void setLayerList(List<CaseLayerVO> layerList) {
		this.layerList = layerList;
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

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getOriginalSizePreview() {
		return originalSizePreview;
	}

	public void setOriginalSizePreview(String originalSizePreview) {
		this.originalSizePreview = originalSizePreview;
	}

	
	
}
