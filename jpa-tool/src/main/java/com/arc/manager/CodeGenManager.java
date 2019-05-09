package com.arc.manager;

import com.arc.model.ColumnClass;
import com.arc.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import java.sql.*;
import java.util.Date;

/**
 * @description:
 * @author: yechao
 * @date: 2018/10/16 19:27
 */
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
    private String URL="jdbc:mysql://localhost:3306/sso?useUnicode=true&characterEncoding=UTF-8&useAffectedRows=true&useSSL=false";
    private String USERNAME = "root";
    private String PASSWORD = "admin";
    private String DRIVER = "com.mysql.jdbc.Driver";
    private String diskPath;
    private String changeTableName;


    public Connection getConnection() throws Exception {
        //1.加载驱动程序
        Class.forName(DRIVER);
        //2.获得数据库链接
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }


    public static void main(String[] args) {
        CodeGenManager codeGenManager = new CodeGenManager();
        Connection connection = null;
        try {
            connection = codeGenManager.getConnection();

            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet resultSet = databaseMetaData.getColumns(null, "%", "user", "%");
            System.out.println(databaseMetaData);
            System.out.println(databaseMetaData);
            System.out.println(databaseMetaData);


            ColumnClass columnClass = null;
            columnClass = new ColumnClass();


            //    private String columnName;//数据库字段名称
            //    private String columnType;//数据库字段类型
            //    private String changeColumnName;//数据库字段首字母小写且去掉下划线字符串
            //    private String columnComment;//数据库字段注释


//            String length = resultSet.getString("CHAR_OCTET_LENGTH");
            //获取字段名称
            columnClass.setColumnName(resultSet.getString("COLUMN_NAME"));
            //获取字段类型
            columnClass.setColumnType(resultSet.getString("TYPE_NAME"));
            //转换字段名称，如 sys_name 变成 SysName
            columnClass.setChangeColumnName(replaceUnderLineAndUpperCase(resultSet.getString("COLUMN_NAME")));
            //字段在数据库的注释
            columnClass.setColumnComment(resultSet.getString("REMARKS"));

            System.out.println(columnClass);










        } catch (SQLException e) {
            e.printStackTrace();
        } catch (
                Exception e) {
            e.printStackTrace();
        }

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
