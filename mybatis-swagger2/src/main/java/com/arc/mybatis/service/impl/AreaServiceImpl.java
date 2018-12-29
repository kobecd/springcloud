package com.arc.mybatis.service.impl;

import com.arc.mybatis.mapper.AreaMapper;
import com.arc.mybatis.model.entries.Area;
import com.arc.mybatis.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: yechao
 * @date: 2018/12/26 11:31
 * @description:
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    @Transactional(readOnly = true)
    public Area get(String code) {
        return areaMapper.get(code);
    }

    @Override
    @Transactional(readOnly = true)
    public Area tree(String root) {
        return areaMapper.tree(root);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Area> listChildren(String root) {
        return areaMapper.listChildren(root);
    }

    @Override
    @Transactional(readOnly = true)
    public Area getByShortCodeAndLevel(String shortCode, String level) {
        return areaMapper.getByShortCodeAndLevel(shortCode, level);
    }

    @Override
    @Transactional(readOnly = true)
    public Area treeCity(String root) {
        Area area = areaMapper.tree(root);
        List<Area> provinceChildren = area.getChildren();//得到省列表
        for (Area provinceChild : provinceChildren) {
            List<Area> cityChildren = provinceChild.getChildren();//得到市或者地区列表
            for (Area cityChild : cityChildren) {
                if (cityChild.getAreaLevel().equals(3)) {
                    cityChildren.remove(cityChild);
                }
                cityChild.setChildren(null);
            }
        }
        return area;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Area> list(List<String> areaCodes) {
        return areaMapper.list(areaCodes);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Area> listOrdered() {
        return areaMapper.listOrdered();
    }
}
