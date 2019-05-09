package com.arc.model;

import java.io.File;
import java.util.Map;

/**
 * 模板信息的试题
 *
 * @author why
 */
public class TemplateGenModel {

    private String templateName;//模板名称
    private File mapperFile;//mapperFile
    Map<String, Object> dataMap;//数据集合

    public TemplateGenModel(String templateName, File mapperFile, Map<String, Object> dataMap) {
        this.templateName = templateName;
        this.mapperFile = mapperFile;
        this.dataMap = dataMap;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public File getMapperFile() {
        return mapperFile;
    }

    public void setMapperFile(File mapperFile) {
        this.mapperFile = mapperFile;
    }

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }
}
