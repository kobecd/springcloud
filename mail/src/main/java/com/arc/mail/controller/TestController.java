package com.arc.mail.controller;

import com.arc.mail.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

/**
 * @author: yechao
 * @date: 2018/11/15 19:14
 * @description:
 */
@Slf4j
@Controller
@RestController
@RequestMapping("/test")
public class TestController {


    //    @Value("${spring.datasource.url}")
//    private String url=" jdbc:mysql://localhost:3306/gree";
    private String url = "jdbc:mysql://dev.yodoo.net.cn:16100/gree";

    //    @Value("${spring.datasource.user:root}")
    private String user = "root";

    //    @Value("${spring.datasource.password:admin}")
    private String password = "Yodoo2017";

    //    @Value("${spring.datasource.driver:com.mysql.jdbc.Driver}")
    private String driver = "com.mysql.jdbc.Driver";

    @RequestMapping("/1")
    public Object t1() {
        long start = System.currentTimeMillis();
        User user1 = new TestController().fun1();
        log.info("jdbc 方式查询数据库耗时={} ms ", (System.currentTimeMillis() - start));
        System.out.println(user1.toString());
        return System.currentTimeMillis() - start;
    }

    @RequestMapping("/2")
    public Object t2() {
        long start = System.currentTimeMillis();
        log.info("jpa 方式查询数据库耗时={} ms ", (System.currentTimeMillis() - start));
        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {
        System.out.println((double) 63570 / (double) 92492);
    }


    private User fun1() {
        log.debug("结果={}, {}, {}", url, user, password, driver);
        User userBack = null;
        //1.加载驱动程序
        Statement statement = null;
        ResultSet resultSet = null;
        Connection conn = null;
        try {
            Class.forName(driver);
            //2.获得数据库链接
            conn = DriverManager.getConnection(url, user, password);
            //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
            statement = conn.createStatement();
            resultSet = statement.executeQuery("select * from t_sys_user");
            //4.处理数据库的返回结果(使用ResultSet类)
            while (resultSet.next()) {
                userBack = new User();
                userBack.setUsername(resultSet.getString("username"));
                userBack.setPassword(resultSet.getString("password"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        //关闭资源
        finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return userBack;
    }
}
