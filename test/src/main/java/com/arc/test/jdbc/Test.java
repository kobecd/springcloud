package com.arc.test.jdbc;

import java.sql.*;

/**
 * @author: yechao
 * @date: 2018/11/10 16:49
 * @description:
 */
public class Test {


    private static final String URL = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&useAffectedRows=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) throws Exception {
        testGetDataByJDBC();
    }


    public static Object testGetDataByJDBC() throws SQLException, ClassNotFoundException {
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
        return rs;
    }

}
