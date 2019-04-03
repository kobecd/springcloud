package com.arc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 数据库的连接信息
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class DatasourceInfo {

    private String url; // 资源地址
    private String username = "root"; // 资源账号
    private String password = "admin"; // 资源密码
    private String driver = "com.mysql.jdbc.Driver"; // 资源驱动
    private String dbType = "mysql"; // 数据类型（mysql、db2、MQ、Redis、）
    private String tableName;
    private String ftlFilePath;
    private String outFilePath;
    private String clzPackage;

    private String author;


    /**
     * 获取输出路径
     *
     * @return
     */
    public static String getProperty() {
        return System.getProperty("user.dir") + File.separator + "target" + File.separator + "out";
    }



}