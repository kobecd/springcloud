package com.arc.model.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 * @author: yechao
 * @date: 2018/11/10 16:49
 * @description:
 */
public class Test {

    public static Object main() {
        return new Date();
    }


    public static void main(String[] args) throws Exception {
        String URL = "jdbc:mysql://dev.yodoo.net.cn:16100/gree?useUnicode=true&characterEncoding=UTF-8&useAffectedRows=true&useSSL=false";
        String USER = "root";
        String PASSWORD = "Yodoo2017";

        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT  * FROM t_cash_advance");
        //如果有数据，rs.next()返回true
        while (rs.next()) {
            System.out.println(rs);
            System.out.println(rs);
        }
    }
}
