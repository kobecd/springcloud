package com.rongyi.hla.mapper.product;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * 初始化数据库的Mapper
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
public interface InitDatabaseMapper {

    /**
     * 判断mysql中是否有某个数据库
     * @param dbName
     * @return
     */
    Map<String, String> getDatabase(@Param("dbName")String dbName);

    /**
     * 判断数据库中是否有某个表
     * @param dbName
     * @param tableName
     * @return
     */
    Map<String, String> getTable(@Param("dbName")String dbName,@Param("tableName")String tableName);

    Integer createDatabase(@Param("dbName")String dbName);

    Integer createTableForFile();

    Integer createTableForProduct();

    Integer createTableForProductSpu();

    Integer createTableForProductGroup();

    Integer createTableForProductGroupSpu();

    Integer createTableForToken();

    Integer createTableForPullLog();


}
