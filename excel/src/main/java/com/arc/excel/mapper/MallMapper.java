package com.arc.excel.mapper;

import com.arc.excel.model.entries.mall.Mall;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是持久层，目的是与数据库交互，
 */
public interface MallMapper {

    int save(Mall mall);

    int delete(Long id);

    int update(Mall mall);

    Mall get(Long id);

    List<Mall> list();

}
