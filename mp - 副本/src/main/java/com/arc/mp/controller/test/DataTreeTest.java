package com.arc.mp.controller.test;


import com.arc.mp.controller.test.model.ITreeNode;
import com.arc.mp.controller.test.model.Node;
import com.arc.mp.controller.test.model.Org;

import java.util.ArrayList;
import java.util.List;

public class DataTreeTest {

    public static void main(String[] args) {
        DataServiceImpl dataServiceImpl = new DataServiceImpl(genOrgList());
        Node node = dataServiceImpl.getTreeNode(18L);
        System.out.println(node);
//        SimplePropertyPreFilter filter = new SimplePropertyPreFilter(); // 构造方法里，也可以直接传需要序列化的属性名字
//        filter.getExcludes().add("parent");
//        filter.getExcludes().add("allChildren");
//        String data = JSONObject.toJSONString(node, filter);
//        System.out.println(data);
    }

    public static List<ITreeNode> genOrgList(){
        List<ITreeNode> list = new ArrayList<ITreeNode>();
        //    public Org(String uuid, String parentId, String name, Integer orderNum, String code, String type){
        list.add(new Org(200L, 1L, "上海市", 2, "200000", 2));
//    public Org(Long uuid, Long parentId, String name, Integer orderNum, String code, Integer type) {

        Org org = new Org(2L, 1L, "北京市", 2, "110000", 2);
        list.add(org);
        org = new Org(3L, 2L, "市辖区", 3, "110100", 3);
        list.add(org);
        org = new Org(4L, 3L, "东城区", 4, "110101", 4);
        list.add(org);
        org = new Org(5L, 3L, "东城区", 5, "110102", 4);
        list.add(org);
        org = new Org(6L, 3L, "东城区", 6, "110105", 4);
        list.add(org);
        org = new Org(7L, 3L, "东城区", 7, "110106", 4);
        list.add(org);
        org = new Org(8L, 3L, "东城区", 8, "110107", 4);
        list.add(org);
        org = new Org(9L, 3L, "东城区", 9, "110108", 4);
        list.add(org);
        org = new Org(10L, 3L, "东城区", 10, "110109", 4);
        list.add(org);
        org = new Org(11L, 3L, "东城区", 11, "110111", 4);
        list.add(org);
        org = new Org(12L, 3L, "东城区", 12, "110112", 4);
        list.add(org);
        org = new Org(13L, 3L, "东城区", 13, "110113", 4);
        list.add(org);
        org = new Org(14L, 3L, "东城区", 14, "110114", 4);
        list.add(org);
        org = new Org(15L, 3L, "东城区", 15, "110115", 4);
        list.add(org);
        org = new Org(16L, 3L, "东城区", 16, "110116", 4);
        list.add(org);
        org = new Org(17L, 3L, "东城区", 17, "110117", 4);
        list.add(org);
        org = new Org(18L, 2L, "县", 3, "110200", 3);
        list.add(org);
        org = new Org(19L, 18L, "密云县", 19, "110228", 4);
        list.add(org);
        org = new Org(20L, 18L, "延庆县", 20, "110229", 4);
        list.add(org);
        return list;
    }

}
