package com.arc.mp.controller.test;

import com.arc.mp.controller.test.model.ITreeNode;
import com.arc.mp.controller.test.model.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class DataServiceImpl implements DataService {

//     获取树形结构数据集合
//    List<Node> getTree();
//      获取根节点数据集合
//    List<Node> getRoot();
//      获取指定节点下的树形节点（该节点的子节点会被填充）
//    Node getTreeNode(String nodeId);

    //这里Map的 key=id ，value=树节点
    private HashMap<Long, Node> treeNodesMap = new HashMap<Long, Node>();

    private List<Node> nodesList = new ArrayList<Node>();

    /**
     * 构造传入数据 nodesList，
     * 建议在构造内初始化listNodes 【已经组装成为树形结构的】(实际也确实是在构造方法中完成的)
     * todo 我的数据是list <Object>  那么我哪里是需要分层 ，然后便利顶层数据，组装tree，换句话说， 组装是一个重复调用，在此逻辑外需要维护一个找出顶层节点的集合，
     *
     * @param list<TreeNodes>
     */
    public DataServiceImpl(List<ITreeNode> list) {
        initTreeNodeMap(list);
        initTreeNodeList();
    }


    private void initTreeNodeMap(List<ITreeNode> list) {
        Node node = null;
        for (ITreeNode item : list) {
            node = new Node(item);
            //key 既是 节点的id value 为节点        注意：节点本身后面会递归吧？
            treeNodesMap.put(node.getNodeId(), node);
        }

        Iterator<Node> iter = treeNodesMap.values().iterator();
        Node parentNode = null;
        //遍历 数据节点
        while (iter.hasNext()) {
            node = iter.next();
            if (node.getParentNodeId() == null ) {
                continue;
            }
            //取出节点的 父级节点
            parentNode = treeNodesMap.get(node.getParentNodeId());
            if (parentNode != null) {
                //1设置当前遍历时候节点的父节点
                node.setParent(parentNode);
                //2对于父节点的子节点补全
                parentNode.addChild(node);
            }
        }



    }



    private void initTreeNodeList() {
        if (nodesList.size() > 0) {
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
                this.nodesList.add(node);
                this.nodesList.addAll(node.getAllChildren());
            }
        }
    }


    //-------------------------------------------------------------------------------------------------------

    @Override
    public List<Node> getTree() {
        return this.nodesList;
    }

    @Override
    public List<Node> getRoot() {
        List<Node> rootList = new ArrayList<Node>();
        if (this.nodesList.size() > 0) {
            for (Node node : nodesList) {
                if (node.getParent() == null)
                    rootList.add(node);
            }
        }
        return rootList;
    }

    @Override
    public Node getTreeNode(Long nodeId) {
        return this.treeNodesMap.get(nodeId);
    }

}
