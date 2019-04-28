package com.arc.mp.service.impl;

import com.arc.mp.mapper.system.CardMapper;
import com.arc.mp.model.domain.Card;
import com.arc.mp.service.CardService2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/15 15:45
 */
@Slf4j
@Service
public class CardServiceImpl2 implements CardService2 {

    @Resource
    CardMapper cardMapper;

    @Override
    public List<Card> treeByProjectId(Long projectId) {
        List<Card> cardList = cardMapper.listByProjectId(projectId);
        return treeNodes1(cardList);
    }


    /**
     * 1.0.0 版本
     * 解决固定级数的数据集合【3级别】
     *
     * @param cardList
     * @return
     */
    public List<Card> treeNodes1(List<Card> cardList) {
        List<Card> backList = new ArrayList<>(cardList.size());
        //数据按照level分层 level =1，2，3，4，，，

        //分三级
        ArrayList<Card> nodesLevel1 = new ArrayList<>();
        ArrayList<Card> nodesLevel2 = new ArrayList<>();
        ArrayList<Card> nodesLevel3 = new ArrayList<>();
        ArrayList<Card> nodesLevel4 = new ArrayList<>();

        if (cardList != null && cardList.size() > 0) {
            for (Card card : cardList) {
                if (card.getLevel() == 1) {
                    nodesLevel1.add(card);
                } else if (card.getLevel() == 2) {
                    nodesLevel2.add(card);
                } else if (card.getLevel() == 3) {
                    nodesLevel3.add(card);
                } else if (card.getLevel() == 4) {
                    nodesLevel4.add(card);
                }
            }
        }

        //level1
        for (Card root : nodesLevel1) {
            ArrayList<Card> childrenForLevel1 = new ArrayList<>();
            //level2
            for (Card secondChildrenNode : nodesLevel2) {
                ArrayList<Card> childrenForLevel2 = new ArrayList<>();
                log.debug("二级的父级code={} ", secondChildrenNode.getParentId());
                log.debug("根的code   ={}       ", root.getId());
                if (secondChildrenNode.getParentId().equals(root.getId())) { // 二级的父级code匹配的
                    secondChildrenNode.setParentName(root.getParentName());
                    childrenForLevel1.add(secondChildrenNode);
                }
                //level3
                for (Card thirdChildrenNode : nodesLevel3) {
                    ArrayList<Card> childrenForLevel3 = new ArrayList<>();
                    if (thirdChildrenNode.getParentId().equals(secondChildrenNode.getId())) {
                        thirdChildrenNode.setParentName(secondChildrenNode.getName());
                        childrenForLevel2.add(thirdChildrenNode);
                    }
                    //level4
                    for (Card childNode4 : nodesLevel4) {
                        ArrayList<Card> childrenForLevel4 = new ArrayList<>();
                        if (childNode4.getParentId().equals(thirdChildrenNode.getId())) {
                            childNode4.setParentName(thirdChildrenNode.getName());
                            childrenForLevel4.add(childNode4);
                        }
                        childNode4.setChildren(childrenForLevel4);
                    }
                    thirdChildrenNode.setChildren(childrenForLevel3);
                }
                //一次跟节点循环后把该层的子节点寻找完毕
                secondChildrenNode.setChildren(childrenForLevel2);
            }
            root.setChildren(childrenForLevel1);
            backList.add(root);
        }
        return backList;
    }


    //----------------------------------------------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------------------------

//    /**
//     * 2.0.0版本 分层然后迭代
//     *
//     * @param nodes
//     * @return
//     */
//    private List<Node> treeNodes2(List<Card> nodes) {
//
//        //  * 建议在构造内初始化listNodes 【已经组装成为树形结构的】(实际也确实是在构造方法中完成的)
//        //     * todo 我的数据是list <Object>  那么我哪里是需要分层 ，然后便利顶层数据，
//        //      组装tree，换句话说， 组装是一个重复调用，在此逻辑外需要维护一个找出顶层节点的集合，
//
//        List<Node> backList = new ArrayList<>(nodes.size());
//
//
//        //level -list 数据
//        Map<Integer, List<Card>> map = new HashMap<>();
//
//
//        //准备篮子
//        if (nodes != null && nodes.size() > 0) {
//            ArrayList<Integer> levels = new ArrayList<>();
//            for (Card card : nodes) {
//                levels.add(card.getLevel());
//                map.put(card.getLevel(), new ArrayList<>());
//            }
//
//            //分级 装入篮子
//            for (Card card : nodes) {
//                map.get(card.getLevel()).add(card);
//            }
//
//            //自然升序
//            levels.sort(Comparator.naturalOrder());
//
//            //对于不同级别进行数据组装
//            for (Integer level : levels) {
//                for (Card root : map.get(level)) {
//                    ArrayList<Node> childrenNodes = new ArrayList<>();
//                    level++;
//                    List<Card> nextNodes = map.get(level);
//                    if (nextNodes != null) {
//                        for (Card secondChildrenNode : nextNodes) {
//                            log.debug("PId   ={}       ", root.getId());
//                            log.debug("Next node is has PId={} ", secondChildrenNode.getParentId());
//                            if (secondChildrenNode.getParentId().equals(root.getId())) { // 二级的父级code匹配的
//                                secondChildrenNode.setParentName(root.getParentName());
//                                childrenNodes.add(secondChildrenNode);
//                            }
//                        }
//                    }
//                    root.setChildren(childrenNodes);
//                    backList.add(root);
//                }
//            }
//        }
//        return backList;
//
//    }
//

    public static void main(String[] args) {

//        List<Card> nodes = new ArrayList<>();
        List<Card> nodes = null;


        Iterator<Card> iterator = nodes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        for (Card node : nodes) {//Exception in thread "main" java.lang.NullPointerException
            System.out.println(node);
        }

    }
}
