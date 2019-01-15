package com.rongyi.hla.init;

import com.rongyi.hla.mapper.product.InitDatabaseMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class SystemInitializationStartup implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private InitDatabaseMapper dbMapper;

    //配置在配置文件中
    //	@Value("${system.initial:false}")
//    boolean initial = Boolean.TRUE;
    boolean initial = Boolean.FALSE;



    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //Spring容器加载完毕之后执行: 以下方法
        if (initial) {
            //服务器文件夹地址初始化
            initDataBase();

        }

    }

    /**
     * 初始化数据库
     */
    private void initDataBase() {
        String dbName = "hla";
        try {

            Map<String, String> db = dbMapper.getDatabase(dbName);
            if (db == null) {
                Integer integer = dbMapper.createDatabase(dbName);
            }

            Map<String, String> file = dbMapper.getTable(dbName, "file");
            if (file == null) {
                Integer tableForFile = dbMapper.createTableForFile();
                log.debug("file 表创建完成,{}",tableForFile);
            }

            Map<String, String> token = dbMapper.getTable(dbName, "token");
            if (token == null) {
                Integer tableForFile = dbMapper.createTableForToken();
                log.debug("token 表创建完成,{}",tableForFile);
            }

            Map<String, String> product = dbMapper.getTable(dbName, "product");
            if (product == null) {
                Integer tableForFile = dbMapper.createTableForProduct();
                log.debug("product 表创建完成,{}",tableForFile);
            }

            Map<String, String> spu = dbMapper.getTable(dbName, "product_spu");
            if (spu == null) {
                Integer tableForFile = dbMapper.createTableForProductSpu();
                log.debug("product_spu 表创建完成,{}",tableForFile);
            }



            Map<String, String> group = dbMapper.getTable(dbName, "product_group");
            if (group == null) {
                Integer tableForFile = dbMapper.createTableForProductGroup();
                log.debug("product_group 表创建完成,{}",tableForFile);
            }

            Map<String, String> group_spu = dbMapper.getTable(dbName, "group_spu");
            if (group_spu == null) {
                Integer tableForFile = dbMapper.createTableForProductGroupSpu();
                log.debug("group_spu 表创建完成,{}",tableForFile);
            }

            Map<String, String> pull_log = dbMapper.getTable(dbName, "pull_log");
            if (pull_log == null) {
                Integer tableForFile = dbMapper.createTableForPullLog();
                log.debug("group_spu 表创建完成,{}",tableForFile);
            }



        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            log.debug("数据库初始化完成");
        }

    }




//-----------------------------------------------------------------------------------------------
//    private void initDataBase() {
//        try {
//                int getTotalCount = productMapper.getTotalCount();
//                if (getTotalCount == 0) {
//                    productMapper.dropTable();
//                    productMapper.createTable();
//                }
//        } catch (Exception e) {
//            log.error(e.getMessage());
//                productMapper.dropTable();
//                productMapper.createTable();
//        }

//    }
}
