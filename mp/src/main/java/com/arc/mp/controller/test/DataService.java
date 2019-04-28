package com.arc.mp.controller.test;

import com.arc.mp.controller.test.model.TreeNode;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/16 13:44
 */
public interface DataService {

      List<TreeNode> getTree();

      List<TreeNode> getRoot();

      TreeNode getTreeNode(String nodeId);
}
