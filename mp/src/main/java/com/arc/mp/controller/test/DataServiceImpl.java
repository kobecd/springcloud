package com.arc.mp.controller.test;

import com.arc.mp.controller.test.model.ITreeNode;
import com.arc.mp.controller.test.model.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class DataServiceImpl implements DataService {

//     获取树形结构数据集合
//    List<TreeNode> getTree();
//      获取根节点数据集合
//    List<TreeNode> getRoot();
//      获取指定节点下的树形节点（该节点的子节点会被填充）
//    TreeNode getTreeNode(String nodeId);

    //这里Map的 key=id ，value=树节点
    private HashMap<String, TreeNode> treeNodesMap = new HashMap<String, TreeNode>();

    private List<TreeNode> treeNodesList = new ArrayList<TreeNode>();

    /**
     * 构造传入数据 treeNodesList，
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
        TreeNode treeNode = null;
        for (ITreeNode item : list) {
            treeNode = new TreeNode(item);
            //key 既是 节点的id value 为节点        注意：节点本身后面会递归吧？
            treeNodesMap.put(treeNode.getNodeId(), treeNode);
        }

        Iterator<TreeNode> iter = treeNodesMap.values().iterator();
        TreeNode parentTreeNode = null;
        //遍历 数据节点
        while (iter.hasNext()) {
            treeNode = iter.next();
            if (treeNode.getParentNodeId() == null || treeNode.getParentNodeId() == "") {
                continue;
            }
            //取出节点的 父级节点
            parentTreeNode = treeNodesMap.get(treeNode.getParentNodeId());
            if (parentTreeNode != null) {
                //1设置当前遍历时候节点的父节点
                treeNode.setParent(parentTreeNode);
                //2对于父节点的子节点补全
                parentTreeNode.addChild(treeNode);
            }
        }



    }



    private void initTreeNodeList() {
        if (treeNodesList.size() > 0) {
            return;
        }
        if (treeNodesMap.size() == 0) {
            return;
        }

        Iterator<TreeNode> iter = treeNodesMap.values().iterator();
        TreeNode treeNode = null;
        while (iter.hasNext()) {
            treeNode = iter.next();
            if (treeNode.getParent() == null) {
                this.treeNodesList.add(treeNode);
                this.treeNodesList.addAll(treeNode.getAllChildren());
            }
        }
    }


    //-------------------------------------------------------------------------------------------------------

    @Override
    public List<TreeNode> getTree() {
        return this.treeNodesList;
    }

    @Override
    public List<TreeNode> getRoot() {
        List<TreeNode> rootList = new ArrayList<TreeNode>();
        if (this.treeNodesList.size() > 0) {
            for (TreeNode node : treeNodesList) {
                if (node.getParent() == null)
                    rootList.add(node);
            }
        }
        return rootList;
    }

    @Override
    public TreeNode getTreeNode(String nodeId) {
        return this.treeNodesMap.get(nodeId);
    }

}
