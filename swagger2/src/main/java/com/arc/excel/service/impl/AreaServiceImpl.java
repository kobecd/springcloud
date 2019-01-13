package com.arc.excel.service.impl;

import com.arc.excel.service.AreaService;
import com.arc.excel.model.entries.Area;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/12/26 11:31
 * @description:
 */
@Service
public class AreaServiceImpl implements AreaService {


    @Override
    public Area get(String code) {
        return new Area(code, "XXX_测试写死");
    }

    @Override
    public Area tree(String root) {
        return new Area(root, "XXX_测试写死");
    }

    @Override
    public List<Area> listChildren(String root) {
        ArrayList<Area> list = new ArrayList<>();
        Area area1 = new Area("140100", "太原市_测试写死");
        Area area2 = new Area("320100", "南京市_测试写死");
        list.add(area1);
        list.add(area2);
        return list;

    }

    @Override
    public Area getByShortCodeAndLevel(String shortCode, String level) {
        return new Area(shortCode, "XXX_测试写死");
    }

    @Override
    public Area treeCity(String root) {
        return new Area(root, "测试数据_测试写死");

    }


    @Override
    public List<Area> list(List<String> areaCodes) {
        ArrayList<Area> list = new ArrayList<>();
        Area area1 = new Area("140100", "太原市_测试写死");
        Area area2 = new Area("320100", "南京市_测试写死");
        list.add(area1);
        list.add(area2);
        return list;
    }

    @Override
    public List<Area> listOrdered() {
        ArrayList<Area> list = new ArrayList<>();
        Area area1 = new Area("140100", "太原市_测试写死");
        Area area2 = new Area("320100", "南京市_测试写死");
        list.add(area1);
        list.add(area2);
        return list;
    }
}
