package com.arc.mp.service.impl;

import com.arc.mp.mapper.system.CardMapper;
import com.arc.mp.model.domain.Card;
import com.arc.mp.model.domain.Node;
import com.arc.mp.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author 叶超
 * @since 2019/4/15 15:45
 */
@Slf4j
@Service
public class CardServiceImpl implements CardService {


    //     由list数据完成树形结构数据组装
//    List<TreeNode>       treeNodes(cardList);

//      获取根节点数据集合
//    List<TreeNode> getRoot();

//      获取指定节点下的树形节点（该节点的子节点会被填充）
//    TreeNode getTreeNode(String nodeId);


    @Resource
    CardMapper cardMapper;

    @Override
    public List<Card> listByProjectId(Long projectId) {
        return cardMapper.listByProjectId(projectId);
    }


    private Map<Long, Node> treeNodesMap = new HashMap<>();
    private List<Node> treeNodesList = new ArrayList<>();

    @Override
    public List<Node> treeByProjectId(Long projectId) {
        List<Card> cardList = listByProjectId(projectId);
        //  由list数据完成树形结构数据组装
        List<Node> nodes = new ArrayList<>();

        for (Card card : cardList) {
            Node node = new Node();
            node.setId(card.getId());
            node.setParent(card.getParent());
            node.setParentId(card.getParentId());
            node.setLevel(card.getLevel());
            nodes.add(node);
        }

        System.out.println(nodes.size());
        System.out.println(nodes.size());
        System.out.println(nodes.size());
        System.out.println(nodes.size());

        List<Node> backNodes = null;
        try {
            backNodes = treeNodes3(nodes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return backNodes;
    }


    /**
     * 3.0.0版本
     * todo 对于list数据完成 树形组装
     * todo 我的数据是  List<Card> treeNodesList
     * 那么我哪里是需要分层 ，然后便利顶层数据，组装tree，换句话说， 组装是一个重复调用，在此逻辑外需要维护一个找出顶层节点的集合，
     * node  parent next
     *
     * @param nodes
     * @return
     */
    private List<Node> treeNodes3(List<Node> nodes) {
        initTreeNodeMap(nodes);
        initTreeNodeList();
        System.out.println(treeNodesList.size());
        return treeNodesList;
    }

    /**
     * @param nodes
     */
    private void initTreeNodeMap(List<Node> nodes) {
        //  * 建议在构造内初始化listNodes 【已经组装成为树形结构的】(实际也确实是在构造方法中完成的)
        if (nodes == null || nodes.size() == 0) {
            throw new RuntimeException("所迭代集合为空");
        }


        Node currentNode = null;
        for (Node node : nodes) {
            currentNode = node;
            treeNodesMap.put(node.getId(), currentNode);
        }

        //处理 treeNodesMap node的节点
        Iterator<Node> iterator = treeNodesMap.values().iterator();
        Node preNode = null;
        while (iterator.hasNext()) {
            currentNode = iterator.next();
            if (currentNode.getParentId() == null) {
                continue;
            }
            preNode = treeNodesMap.get(currentNode.getParentId());
            if (preNode != null) {
                currentNode.setParent(preNode);
                preNode.addChild(currentNode);
            }
        }

        System.out.println(treeNodesMap.size());
    }

    private void initTreeNodeList() {
        if (treeNodesList.size() > 0) {
            return;
        }
        if (treeNodesMap.size() == 0) {
            return;
        }

        Iterator<Node> iter = treeNodesMap.values().iterator();
        Node node = null;
        while (iter.hasNext()) {
            node = iter.next();
            if (node.getParent() == null) {
                this.treeNodesList.add(node);
                this.treeNodesList.addAll(node.getAllChildren());
            }
        }
    }


}
