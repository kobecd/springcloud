package com.why.codegenerate.manager;

import freemarker.template.Template;
import com.why.codegenerate.model.DatasourceInfo;
import com.why.codegenerate.model.PagePathInfo;
import com.why.codegenerate.model.TemplateGenModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.why.codegenerate.utils.FreeMarkerTemplateUtils;
import com.why.codegenerate.utils.GeneUtils;
import com.why.codegenerate.utils.TimeUtils;

import java.io.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;

/**
 * @author why
 * 说明：代码生成管理
 */
@Service
public class CodeGenManager {


    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String user;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driver;
    private String AUTHOR;
    private final String CURRENT_DATE = TimeUtils.getTimeStr(new Date(), TimeUtils.HHMMSS_FORMAT);
    private String tableName;
    private String packageName;
    private String tableAnnotation;
    private String URL;
    private String USER;
    private String PASSWORD;
    private String DRIVER;
    private String diskPath;
    private String changeTableName;
    /**
     * controller,service 和model位置
     */
    private String businessBasePath;
    private String businessBasePackage;

    public String getDiskPath() {
        return diskPath;
    }

    public String getBusinessBasePath() {
        return businessBasePath;
    }

    public String getChangeTableName() {
        return changeTableName;
    }

    /**
     * 说明：该方法适用于spring boot项目方法是在项目启动情况下调用，会调用application里面的数据库配置的相关信息
     *
     * @param pagePathInfo pagePathInfo.getBasePath()    需要生成包的路径 如user包需要生成在下面的包中
     *                     "D:\testproject\back\src\main\java\com\why\greenhouse\back";
     *                     pagePathInfo.getBasePackage() 基础报名 如user包在
     *                     com.why.greenhouse.back下
     * @return
     */
    public CodeGenManager buildCodeGenerateUtils(PagePathInfo pagePathInfo) {
        this.tableName = pagePathInfo.getTableName();
        this.tableAnnotation = tableName;
        this.changeTableName = GeneUtils.replaceUnderLineAndUpperCase(tableName);
        this.URL = url;
        this.USER = user;
        this.PASSWORD = password;
        this.DRIVER = driver;
        this.diskPath = pagePathInfo.getBasePath() + File.separator + changeTableName.toLowerCase();
        this.packageName = pagePathInfo.getBasePackage() + "." + changeTableName.toLowerCase();
        this.businessBasePath = pagePathInfo.getBusinessBasePath() + File.separator + changeTableName.toLowerCase();
        this.businessBasePackage = pagePathInfo.getBusinessBasePackage() + "." + changeTableName.toLowerCase();
        this.AUTHOR = pagePathInfo.getAuthor();
        return this;
    }

    /**
     * 说明：该方法可以在不用启动项目的情况调用，需要传送数据库的配置信息
     *
     * @param pagePathInfo pagePathInfo.getTableName()表名 如user表
     *                     pagePathInfo.getBasePath()    需要生成包的路径 如user包需要生成在下面的包中
     *                     "D:\testproject\back\src\main\java\com\why\greenhouse\back";
     *                     pagePathInfo.getBasePackage() 基础报名 如user包在
     *                     com.why.greenhouse.back下
     * @param dtInfo       数据库配置信息
     *                     com.why.greenhouse.back下
     * @return 返回CodeGenerateUtils对象
     */
    public CodeGenManager buildGene(PagePathInfo pagePathInfo, DatasourceInfo dtInfo) {
        this.tableName = pagePathInfo.getTableName();
        this.tableAnnotation = tableName;
        this.changeTableName = GeneUtils.replaceUnderLineAndUpperCase(tableName);
        this.URL = dtInfo.getURL();
        this.USER = dtInfo.getUSER();
        this.PASSWORD = dtInfo.getPASSWORD();
        this.DRIVER = dtInfo.getDRIVER();
        this.diskPath = pagePathInfo.getBasePath() + File.separator + changeTableName.toLowerCase();
        this.packageName = pagePathInfo.getBasePackage() + "." + changeTableName.toLowerCase();
        this.businessBasePath = pagePathInfo.getBusinessBasePath() + File.separator + changeTableName.toLowerCase();
        this.businessBasePackage = pagePathInfo.getBusinessBasePackage() + "." + changeTableName.toLowerCase();
        this.AUTHOR = pagePathInfo.getAuthor();
        return this;
    }

    /**
     * 获取数据库连接
     * @return
     * @throws Exception
     */
    public Connection getConnection() throws Exception {
        Class.forName(DRIVER);
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }

    /**
     *  参数 包路径 表名称
     * @param packDir 包路径
     * @param tableName 表名称
     */
    public void generateDao(String packDir, String tableName){
        try {
            Connection connection = getConnection();
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet resultSet = databaseMetaData.getColumns(null, "%", tableName, "%");

            ResultSet allResultSet = databaseMetaData.getColumns(null, "%", tableName, "%");
            String finalChangeTN = StringUtils.isEmpty(tableName) ? changeTableName : tableName;
            String finaldPath = StringUtils.isEmpty(packDir) ? businessBasePath : packDir;

            //主键类型 String
            String idType = getIdType(allResultSet);
            if (StringUtils.isEmpty(finaldPath) || StringUtils.isEmpty(finalChangeTN)) {
                throw new IllegalArgumentException("参数错误");
            }

            //生成与数据库对应的实体类
            TemplateGenModel genEntityModel = GeneUtils.generateEntityFile(resultSet, finaldPath, finalChangeTN);
            generateFileByTemplate(genEntityModel, idType);
            TemplateGenModel genDaoModel = GeneUtils.generateDaoFile(finaldPath, finalChangeTN);
            generateFileByTemplate(genDaoModel, idType);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

        }
    }

    /**
     *
     * @param mydp 磁盘位置
     * @param myctn 表名称
     */
    public void generate(String mydp, String myctn) {
        try {
            Connection connection = getConnection();
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet resultSet = databaseMetaData.getColumns(null, "%", tableName, "%");
            String finalChangeTN = StringUtils.isEmpty(myctn) ? changeTableName : myctn;
            String finaldPath = StringUtils.isEmpty(mydp) ? diskPath : mydp;

            String idType = getIdType(resultSet);
            if (StringUtils.isEmpty(finaldPath) || StringUtils.isEmpty(finalChangeTN)) {
                throw new IllegalArgumentException("参数错误");
            }
            //生成服务层接口文件
            TemplateGenModel genServiceModel = GeneUtils.generateServiceInterfaceFile(finaldPath, finalChangeTN);
            generateFileByTemplate(genServiceModel, idType);
            //生成服务实现层文件
            TemplateGenModel genServiceImplModel = GeneUtils.generateServiceImplFile(finaldPath, finalChangeTN);
            generateFileByTemplate(genServiceImplModel, idType);
            //生成Controller层文件
            TemplateGenModel genControllerModel = GeneUtils.generateControllerFile(finaldPath, finalChangeTN);
            generateFileByTemplate(genControllerModel, idType);
            TemplateGenModel genRequestModel = GeneUtils.generateRequestFile(finaldPath, finalChangeTN);
            generateFileByTemplate(genRequestModel, idType);
            TemplateGenModel genResponseModel = GeneUtils.generateResponseFile(finaldPath, finalChangeTN);
            generateFileByTemplate(genResponseModel, idType);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

        }
    }

    private void generateFileByTemplate(TemplateGenModel genModel, String idType) throws Exception {
        Template template = FreeMarkerTemplateUtils.getTemplate(genModel.getTemplateName());
        FileOutputStream fos = new FileOutputStream(genModel.getMapperFile());
        genModel.getDataMap().put("table_name_small", tableName);
        genModel.getDataMap().put("table_name", changeTableName);
        genModel.getDataMap().put("author", AUTHOR);
        genModel.getDataMap().put("date", CURRENT_DATE);
        genModel.getDataMap().put("package_name", packageName);
        genModel.getDataMap().put("table_annotation", tableAnnotation);
        genModel.getDataMap().put("business_package_name", businessBasePackage);
        genModel.getDataMap().put("id_type", idType);
        Writer out = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"), 10240);
        template.process(genModel.getDataMap(), out);
    }

    private String getIdType(ResultSet resultSet) throws Exception {
        String idType = "Integer";
        while (resultSet.next()) {
            if (resultSet.getString("COLUMN_NAME").equals("id")) {
                if (resultSet.getString("TYPE_NAME").toLowerCase().equals("bigint")) {
                    idType = "Long";
                }
            }
        }
        return idType;
    }
}
