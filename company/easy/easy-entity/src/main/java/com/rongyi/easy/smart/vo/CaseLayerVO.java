package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;

import com.rongyi.easy.smart.entity.CaseLayer;

public class CaseLayerVO implements Serializable {


	private static final long serialVersionUID = 8886538575415155844L;
	private Integer id;
    private Integer caseId;//模板ID
    private String mallId;//商场ID
    private Integer top;//上
    private Integer left;//左
    private Integer width;//宽度
    private Integer height;//高度
    private Integer type; //图层类型， 1  图片， 2 视频，3，flash ，4 时间和日期， ,5 外链url
    //private String detail;//图层 内容详情（只有在类型是日期或者天气，外链url时有用），存设置的json 或 外链的url
    private Integer interval;//图片播放的间隔】
    private Integer state;//状态， 1 正常， 0 删除
    private Integer index;//图层顺序
    
    private Object detailMap;//图层属性

    private Integer isTemplate;//是否公共资源
    
    private List<ModuleSourceVO> dataList;//资源路径

    public CaseLayerVO() {
    	
    }
    
    public CaseLayerVO(CaseLayer layer) {
    	this.id = layer.getId();
    	this.mallId = layer.getMallId();
    	this.caseId = layer.getCaseId();
    	this.top = layer.getTop();
    	this.left = layer.getLeft();
    	this.width = layer.getWidth();
    	this.height = layer.getHeight();
    	this.type = layer.getType();
    	//this.detail = layer.getDetail();
    	this.interval = layer.getInterval();
    	this.state = layer.getState();
    	this.index = layer.getIndex();
    	if (StringUtils.isNotBlank(layer.getDetail())) {
    		JSONObject json = JSONObject.fromObject(layer.getDetail());
			this.detailMap = json;
    	}
    }


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

//	public String getDetail() {
//		return detail;
//	}
//
//	public void setDetail(String detail) {
//		this.detail = detail;
//	}

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Object getDetailMap() {
		return detailMap;
	}

	public void setDetailMap(Object detailMap) {
		this.detailMap = detailMap;
	}

	public Integer getIsTemplate() {
		return isTemplate;
	}

	public void setIsTemplate(Integer isTemplate) {
		this.isTemplate = isTemplate;
	}

	public List<ModuleSourceVO> getDataList() {
		return dataList;
	}

	public void setDataList(List<ModuleSourceVO> dataList) {
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return "CaseLayerVO [id=" + id + ", caseId=" + caseId + ", mallId="
				+ mallId + ", top=" + top + ", left=" + left + ", width="
				+ width + ", height=" + height + ", type=" + type
				+ ", interval=" + interval + ", state=" + state + ", index="
				+ index + ", detailMap=" + detailMap + ", isTemplate="
				+ isTemplate + ", dataList=" + dataList + "]";
	}
	
}
