package com.rongyi.easy.smart.param;


import com.rongyi.easy.smart.entity.GeneralCaseLayer;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yandong on 2017/10/19.
 */
public class CaseLayerParam<T> extends BaseParam implements Serializable {

    private List<Integer> idList;
    private Integer pageId;
    private Integer state;
    private Integer caseLayerId;
    private List<GeneralCaseLayer<T>> caseLayerList;
    private Integer type;
    private List<T> dataList;
    private Integer isPublic; //是否共有
    private Integer isTemplate;//是否是自定义模板
    private Integer templateId;
    //ADD 2018/3/21
    private String caseName;//模板名称

    private String preview;//模板预览图
    
    private Integer from;//1 小程序，2.大运营后台 ，

    private String direction;
    
    private Integer style;//模板类型: 1 标准版， 2 简易模板（易拉宝）， 3 自定义模板（电子易拉宝）, 4 贴纸模板, 5广告模板
    
    private String resolution;//电子易拉宝模板分辨率
    
    private Integer layoutId;//应用ID
    
    private Integer caseCategoryId;//模板类目ID

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCaseLayerId() {
        return caseLayerId;
    }

    public void setCaseLayerId(Integer caseLayerId) {
        this.caseLayerId = caseLayerId;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<GeneralCaseLayer<T>> getCaseLayerList() {
        return caseLayerList;
    }

    public void setCaseLayerList(List<GeneralCaseLayer<T>> caseLayerList) {
        this.caseLayerList = caseLayerList;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public Integer getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Integer isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }
    
    public String getCaseName() {
		return caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}
	
	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Integer getStyle() {
		return style;
	}

	public void setStyle(Integer style) {
		this.style = style;
	}

	public Integer getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Integer getCaseCategoryId() {
		return caseCategoryId;
	}

	public void setCaseCategoryId(Integer caseCategoryId) {
		this.caseCategoryId = caseCategoryId;
	}

	@Override
	public String toString() {
		return "CaseLayerParam [idList=" + idList + ", pageId=" + pageId
				+ ", state=" + state + ", caseLayerId=" + caseLayerId
				+ ", caseLayerList=" + caseLayerList + ", type=" + type
				+ ", dataList=" + dataList + ", isPublic=" + isPublic
				+ ", isTemplate=" + isTemplate + ", templateId=" + templateId
				+ ", caseName=" + caseName + ", preview=" + preview + ", from="
				+ from + ", direction=" + direction + ", style=" + style
				+ ", resolution=" + resolution + ", layoutId=" + layoutId
				+ ", caseCategoryId=" + caseCategoryId + "]" + super.toString();
	}
	
}
