package com.arc.mp.controller.test;

import com.arc.mp.controller.test.model.Node;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/16 13:44
 */
public interface DataService {

      List<Node> getTree();

      List<Node> getRoot();

      Node getTreeNode(Long nodeId);
}
