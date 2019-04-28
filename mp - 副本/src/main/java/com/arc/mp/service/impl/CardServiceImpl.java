//package com.arc.mp.service.impl;
//
//import com.arc.mp.mapper.system.CardMapper;
//import com.arc.mp.model.domain.Card;
//import com.arc.mp.service.CardService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.*;
//
///**
// * @author 叶超
// * @since 2019/4/15 15:45
// */
//@Slf4j
//@Service
//public class CardServiceImpl implements CardService {
//
//
//    //     由list数据完成树形结构数据组装
////    List<Node>       treeNodes(cardList);
//
////      获取根节点数据集合
////    List<Node> getRoot();
//
////      获取指定节点下的树形节点（该节点的子节点会被填充）
////    Node getTreeNode(String nodeId);
//
//
//    @Resource
//    CardMapper cardMapper;
//
//    @Override
//    public List<Card> listByProjectId(Long projectId) {
//        return cardMapper.listByProjectId(projectId);
//    }
//
//
//    private Map<Long, Node> treeNodesMap = new HashMap<>();
//    private List<Node> treeNodesList = new ArrayList<>();
//
//    @Override
//    public List<Node> treeByProjectId(Long projectId) {
//        List<Card> cardList = listByProjectId(projectId);
//        //  由list数据完成树形结构数据组装
//        List<Node> nodes = new ArrayList<>();
//
//        for (Card card : cardList) {
//            Node node = new Node();
//            node.setId(card.getId());
//            node.setParent(card.getParent());
//            node.setParentId(card.getParentId());
//            node.setLevel(card.getLevel());
//            nodes.add(node);
//        }
//
//        System.out.println(nodes.size());
//        System.out.println(nodes.size());
//        System.out.println(nodes.size());
//        System.out.println(nodes.size());
//
//        List<Node> backNodes = null;
//        try {
//            backNodes = treeNodes3(nodes);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return backNodes;
//    }
//
//
//    /**
//     * 3.0.0版本
//     * todo 对于list数据完成 树形组装
//     * todo 我的数据是  List<Card> treeNodesList
//     * 那么我哪里是需要分层 ，然后便利顶层数据，组装tree，换句话说， 组装是一个重复调用，在此逻辑外需要维护一个找出顶层节点的集合，
//     * node  parent next
//     *
//     * @param nodes
//     * @return
//     */
//    private List<Node> treeNodes3(List<Node> nodes) {
//        initTreeNodeMap(nodes);
//        initTreeNodeList();
//        System.out.println(treeNodesList.size());
//        return treeNodesList;
//    }
//
//    /**
//     * @param nodes
//     */
//    private void initTreeNodeMap(List<Node> nodes) {
//        //  * 建议在构造内初始化listNodes 【已经组装成为树形结构的】(实际也确实是在构造方法中完成的)
//        if (nodes == null || nodes.size() == 0) {
//            throw new RuntimeException("所迭代集合为空");
//        }
//
//
//        Node currentNode = null;
//        for (Node node : nodes) {
//            currentNode = node;
//            treeNodesMap.put(node.getId(), currentNode);
//        }
//
//        //处理 treeNodesMap node的节点
//        Iterator<Node> iterator = treeNodesMap.values().iterator();
//        Node preNode = null;
//        while (iterator.hasNext()) {
//            currentNode = iterator.next();
//            if (currentNode.getParentId() == null) {
//                continue;
//            }
//            preNode = treeNodesMap.get(currentNode.getParentId());
//            if (preNode != null) {
//                currentNode.setParent(preNode);
//                preNode.addChild(currentNode);
//            }
//        }
//
//        System.out.println(treeNodesMap.size());
//    }
//
//    private void initTreeNodeList() {
//        if (treeNodesList.size() > 0) {
//            return;
//        }
//        if (treeNodesMap.size() == 0) {
//            return;
//        }
//
//        Iterator<Node> iter = treeNodesMap.values().iterator();
//        Node node = null;
//        while (iter.hasNext()) {
//            node = iter.next();
//            if (node.getParent() == null) {
//                this.treeNodesList.add(node);
//                this.treeNodesList.addAll(node.getAllChildren());
//            }
//        }
//    }
//
//    //----------------------------------------------------------------------------------------------------------------------------------------------------
//    //----------------------------------------------------------------------------------------------------------------------------------------------------
//
////    /**
////     * 2.0.0版本 分层然后迭代
////     *
////     * @param nodes
////     * @return
////     */
////    private List<Node> treeNodes2(List<Card> nodes) {
////
////        //  * 建议在构造内初始化listNodes 【已经组装成为树形结构的】(实际也确实是在构造方法中完成的)
////        //     * todo 我的数据是list <Object>  那么我哪里是需要分层 ，然后便利顶层数据，
////        //      组装tree，换句话说， 组装是一个重复调用，在此逻辑外需要维护一个找出顶层节点的集合，
////
////        List<Node> backList = new ArrayList<>(nodes.size());
////
////
////        //level -list 数据
////        Map<Integer, List<Card>> map = new HashMap<>();
////
////
////        //准备篮子
////        if (nodes != null && nodes.size() > 0) {
////            ArrayList<Integer> levels = new ArrayList<>();
////            for (Card card : nodes) {
////                levels.add(card.getLevel());
////                map.put(card.getLevel(), new ArrayList<>());
////            }
////
////            //分级 装入篮子
////            for (Card card : nodes) {
////                map.get(card.getLevel()).add(card);
////            }
////
////            //自然升序
////            levels.sort(Comparator.naturalOrder());
////
////            //对于不同级别进行数据组装
////            for (Integer level : levels) {
////                for (Card root : map.get(level)) {
////                    ArrayList<Node> childrenNodes = new ArrayList<>();
////                    level++;
////                    List<Card> nextNodes = map.get(level);
////                    if (nextNodes != null) {
////                        for (Card secondChildrenNode : nextNodes) {
////                            log.debug("PId   ={}       ", root.getId());
////                            log.debug("Next node is has PId={} ", secondChildrenNode.getParentId());
////                            if (secondChildrenNode.getParentId().equals(root.getId())) { // 二级的父级code匹配的
////                                secondChildrenNode.setParentName(root.getParentName());
////                                childrenNodes.add(secondChildrenNode);
////                            }
////                        }
////                    }
////                    root.setChildren(childrenNodes);
////                    backList.add(root);
////                }
////            }
////        }
////        return backList;
////
////    }
////
//
//    public static void main(String[] args) {
//
////        List<Card> nodes = new ArrayList<>();
//        List<Card> nodes = null;
//
//
//        Iterator<Card> iterator = nodes.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//
//        for (Card node : nodes) {//Exception in thread "main" java.lang.NullPointerException
//            System.out.println(node);
//        }
//
//    }
//
//
//    /**
//     * 1.0.0 版本
//     * 解决固定级数的数据集合【3级别】
//     * 强依赖与实体
//     *
//     * @param cardList
//     * @return
//     */
//    public List<Node> treeNodes1(List<Node> cardList) {
//        List<Node> backList = new ArrayList<>(cardList.size());
//        //数据按照level分层 level =1，2，3，4，，，
//
//        //分三级
//        ArrayList<Node> roots = new ArrayList<>();
//        ArrayList<Node> secondChildrenNodes = new ArrayList<>();
//        ArrayList<Node> thirdChildrenNodes = new ArrayList<>();
//        ArrayList<Node> fourthChildrenNodes = new ArrayList<>();
//
//        if (cardList != null && cardList.size() > 0) {
//            for (Node card : cardList) {
////                int i = 1;
//                if (card.getLevel() == 1) {
//                    roots.add(card);
//                } else if (card.getLevel() == 2) {
//                    secondChildrenNodes.add(card);
//                } else if (card.getLevel() == 3) {
//                    thirdChildrenNodes.add(card);
//                } else if (card.getLevel() == 4) {
//                    fourthChildrenNodes.add(card);
//                }
//            }
//        }
//
//        for (Node root : roots) {
//            //level1
//            ArrayList<Node> childrenForRoot = new ArrayList<>();
//
//            if (root.getId() == 5) {
//                System.out.println(5);
//                System.out.println(5);
//                System.out.println(5);
//                System.out.println(5);
//                System.out.println(5);
//            }
//
//            for (Node childNode1 : secondChildrenNodes) {
//
//                System.out.println(root.getId());
//                System.out.println(childNode1.getParentId());
//                System.out.println(root.getId().equals(childNode1.getParentId()));
//                if (root.getId().equals(childNode1.getParentId())) { // 二级的父级code匹配的
//                    childNode1.setParent(root);
//                    childrenForRoot.add(childNode1);
//                }
//                //level2
//                ArrayList<Node> childrenForSecond = new ArrayList<>();
//                for (Node childNode2 : thirdChildrenNodes) {
//                    if (childNode1.getId().equals(childNode2.getParentId())) {
//                        childNode2.setParent(childNode1);
//                        childrenForSecond.add(childNode2);
//                    }
//                    //level3
////                    ArrayList<Node> childrenForThird = new ArrayList<>();
////                    for (Node childNode3 : fourthChildrenNodes) {
////                        if (childNode2.getId().equals(childNode3.getParentId())) {
////                            childNode3.setParent(childNode2);
////                            childrenForThird.add(childNode3);
////                        }
////                        //level4
////                        ArrayList<Node> childrenForFourth = new ArrayList<>();
////                        for (Node childNode4 : fourthChildrenNodes) {
////                            if (childNode3.getId().equals(childNode4.getParentId())) {
////                                childNode4.setParent(childNode3);
////                                childrenForFourth.add(childNode4);
////                            }
////                        }
////                        childNode3.setChildren(childrenForFourth);
////                    }
////                    childNode2.setChildren(childrenForThird);
//
//
//                }
//                childNode1.setChildren(childrenForSecond);
//            }
//            root.setChildren(childrenForRoot);
//            backList.add(root);
//        }
//        return backList;
//    }
//}
