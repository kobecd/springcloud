package com.arc.mp.service;


import com.arc.mp.model.domain.Card;
import com.arc.mp.model.domain.Node;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/15 15:44
 */
public interface CardService {

    List<Card> listByProjectId(Long projectId);

    List<Node> treeByProjectId(Long projectId);
}
