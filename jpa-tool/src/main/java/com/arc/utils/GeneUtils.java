package com.arc.utils;

import com.arc.model.ColumnClass;
import com.arc.model.TemplateGenModel;
import org.springframework.util.StringUtils;

import java.io.File;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author why
 */
public class GeneUtils {
    /**
     * 根据数据库对象创建java实体类对象
     *
     * @param resultSet 查询数据库返回对象
     * @param diskPath Java类保存位置
     * @param changeTableName 表对应的Java类的名称
     * @throws Exception 抛出异常
     */

    public static TemplateGenModel generateEntityFile(ResultSet resultSet, String diskPath, String changeTableName) throws Exception {

        final String suffix = ".java";
        final String pagePath = diskPath + File.separator+"entity"+File.separator;
        File pageFile = new File(pagePath);
        if (!pageFile.exists()) {
            pageFile.mkdirs();
        }


        final String path = diskPath + File.separator+"entity"+File.separator + changeTableName + suffix;


        final String templateName = "Entity.ftl";
        File mapperFile = new File(path);
        List<ColumnClass> columnClassList = new ArrayList<>();
        ColumnClass columnClass = null;
        while (resultSet.next()) {
            columnClass = new ColumnClass();
            String length = resultSet.getString("CHAR_OCTET_LENGTH");
            //获取字段名称
            columnClass.setColumnName(resultSet.getString("COLUMN_NAME"));
            //获取字段类型
            columnClass.setColumnType(resultSet.getString("TYPE_NAME"));
            //转换字段名称，如 sys_name 变成 SysName
            columnClass.setChangeColumnName(replaceUnderLineAndUpperCase(resultSet.getString("COLUMN_NAME")));
            //字段在数据库的注释
            columnClass.setColumnComment(resultSet.getString("REMARKS"));
            if (length!=null){
                columnClass.setCharOctetLength(length);
            }
            columnClassList.add(columnClass);
        }
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("model_column", columnClassList);
        return new TemplateGenModel(templateName, mapperFile, dataMap);
    }

    /**
     * 生成request对象
     *
     * @throws Exception
     */
    public static TemplateGenModel generateRequestFile(String diskPath, String changeTableName){
        final String suffix = ".java";
        final String pagePath = diskPath + File.separator+ "model" +File.separator+"request"+File.separator;
        File pageFile = new File(pagePath);
        if (!pageFile.exists()) {
            pageFile.mkdirs();
        }
        final String path = pagePath + changeTableName + "Request" + suffix;
        final String templateName = "Request.ftl";
        File mapperFile = new File(path);
        Map<String, Object> dataMap = new HashMap<>();
        return new TemplateGenModel(templateName, mapperFile, dataMap);
    }

    /**
     * 生成response对象
     *
     */
    public static TemplateGenModel generateResponseFile(String diskPath, String changeTableName){
        final String suffix = ".java";
        final String pagePath = diskPath +File.separator + "model" +File.separator+"response"+File.separator;
        File pageFile = new File(pagePath);
        if (!pageFile.exists()) {
            pageFile.mkdirs();
        }
        final String path = pagePath + changeTableName + "Response" + suffix;
        final String templateName = "Response.ftl";
        File mapperFile = new File(path);
        Map<String, Object> dataMap = new HashMap<>();
        return new TemplateGenModel(templateName, mapperFile, dataMap);
    }

    /**
     * 生成response对象
     *
     */
    public static TemplateGenModel generateDaoFile(String diskPath, String changeTableName){
        final String suffix = ".java";
        final String pagePath = diskPath + File.separator+"dao"+File.separator;
        File pageFile = new File(pagePath);
        if (!pageFile.exists()) {
            pageFile.mkdirs();
        }
        final String path = pagePath + changeTableName + "Repository" + suffix;
        final String templateName = "Dao.ftl";
        File mapperFile = new File(path);
        Map<String, Object> dataMap = new HashMap<>();
        return new TemplateGenModel(templateName, mapperFile, dataMap);
    }

    public static TemplateGenModel generateControllerFile(String diskPath, String changeTableName){
        final String pagePath = diskPath + File.separator+ "controller" +File.separator;
        File pageFile = new File(pagePath);
        if (!pageFile.exists()) {
            pageFile.mkdirs();
        }
        final String suffix = "Controller.java";
        final String path = pagePath + changeTableName + suffix;
        final String templateName = "Controller.ftl";
        File mapperFile = new File(path);
        Map<String, Object> dataMap = new HashMap<>();
        return new TemplateGenModel(templateName, mapperFile, dataMap);
    }

    public static TemplateGenModel generateServiceImplFile(String diskPath, String changeTableName){
        final String pagePath = diskPath + File.separator+"service"+File.separator;
        File pageFile = new File(pagePath);
        if (!pageFile.exists()) {
            pageFile.mkdirs();
        }
        final String suffix = "ServiceImpl.java";
        final String path = pagePath + changeTableName + suffix;
        final String templateName = "ServiceImpl.ftl";
        File mapperFile = new File(path);
        Map<String, Object> dataMap = new HashMap<>();
        return new TemplateGenModel(templateName, mapperFile, dataMap);
    }

    public static TemplateGenModel generateServiceInterfaceFile(String diskPath, String changeTableName){
        final String pagePath = diskPath + File.separator+"service"+File.separator;
        File pageFile = new File(pagePath);
        if (!pageFile.exists()) {
            pageFile.mkdirs();
        }
        final String suffix = "Service.java";
        final String path = pagePath + changeTableName + suffix;
        final String templateName = "Service.ftl";
        File mapperFile = new File(path);
        Map<String, Object> dataMap = new HashMap<>();
        return new TemplateGenModel(templateName, mapperFile, dataMap);
    }


    /**
     * 如 sys_name 变成 SysName
     * @param str
     * @return
     */
    public static String replaceUnderLineAndUpperCase(String str) {
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        int count = sb.indexOf("_");
        while (count != 0) {
            int num = sb.indexOf("_", count);
            count = num + 1;
            if (num != -1) {
                char ss = sb.charAt(count);
                char ia = (char) (ss - 32);
                sb.replace(count, count + 1, ia + "");
            }
        }
        String result = sb.toString().replaceAll("_", "");
        return StringUtils.capitalize(result);
    }
}
