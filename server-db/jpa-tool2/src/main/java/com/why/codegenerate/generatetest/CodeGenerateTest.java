package com.why.codegenerate.generatetest;


import com.why.codegenerate.manager.CodeGenFactory;
import com.why.codegenerate.model.DatasourceInfo;
import com.why.codegenerate.model.PagePathInfo;

public class CodeGenerateTest {


    public static void main(String[] args) {
        try {
            codeGenrate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void codeGenrate() throws Exception{
        DatasourceInfo dtInfo = new DatasourceInfo();
        dtInfo.setURL("jdbc:mysql://localhost:3306/gree?useUnicode=true&characterEncoding=UTF-8&useAffectedRows=true&useSSL=false");
        dtInfo.setUSER("root");
        dtInfo.setPASSWORD("admin");
        dtInfo.setDRIVER("com.mysql.jdbc.Driver");

        String tableName = "t_sys_menu";
        String basePath = "C:\\Users\\X\\Desktop\\y\\g2\\service\\fkb-gree\\yodoo-common\\src\\main\\java\\cn\\net\\yodoo\\gree";
        String basePackage = "com.why.test";//package
        String businessBasePath =  "C:\\Users\\X\\Desktop\\y\\g2\\service\\fkb-gree\\yodoo-common\\src\\main\\java\\cn\\net\\yodoo\\gree";
        String businessBasePackage = "cn.net.yodoo.gree.ms";
        String author = "yechao";
        PagePathInfo pathInfo = new PagePathInfo();
        pathInfo = pathInfo.build(tableName,basePath,basePackage,null,null,author);
        PagePathInfo pathInfo1 = new PagePathInfo();
        pathInfo1 = pathInfo1.build("menu",basePath,basePackage,null,null,author);
        PagePathInfo[] pathInfos = {pathInfo,pathInfo1};
        CodeGenFactory genFactory = new CodeGenFactory();
        genFactory.buildData(dtInfo).genCodes(pathInfos);
    }
}
