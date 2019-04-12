package com.arc.mp.mapper;

import com.arc.mp.model.entries.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是持久层，目的是与数据库交互，
 */
public interface AreaMapper {

    Area get(String code);

    Area tree(@Param("root") String root);

    List<Area> listChildren(String root);

    Area getByShortCodeAndLevel(String shortCode, String level);

    List<Area> list(List<String> areaCodes);

    List<Area> listOrdered();
}
