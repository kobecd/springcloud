package com.arc.mybatis.service;


import com.arc.mybatis.model.entries.Area;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author yechao
 * @date 2018/12/21
 */

public interface AreaService {

    /**
     * 通过地区码得到地区对象
     *
     * @param code 地区码
     * @return
     */
    Area get(String code);

    /**
     * 树形查询节点地区
     *
     * @param root 根节点地区码
     * @return
     */
    Area tree(String root);

    /**
     * 根据根节点的地区码 仅找下一级地区码集合
     *
     * @param root 根节点地区码
     * @return
     */
    List<Area> listChildren(String root);

    Area getByShortCodeAndLevel(String shortCode, String level);

    /**
     * 树形查询节点到市级
     *
     * @param root 根节点地区码
     * @return
     */
    Area treeCity(String root);

    List<Area> list(List<String> areaCodes);

    /**
     * 查询城市列表(按首字母排序)
     *
     * @return
     */
    List<Area> listOrdered();
}
