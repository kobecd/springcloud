package com.arc.excel.mapper;


import com.arc.excel.model.entries.mall.MallArea;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是持久层，目的是与数据库交互，
 */
public interface MallAreaMapper {

    int save(MallArea mallArea);

    int delete(Long id);

    int update(MallArea mallArea);

    MallArea get(Long id);

    List<MallArea> list();

}
