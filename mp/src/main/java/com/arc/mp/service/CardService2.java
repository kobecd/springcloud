package com.arc.mp.service;


import com.arc.mp.model.domain.Card;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/15 15:44
 */
public interface CardService2 {

    List<Card> treeByProjectId(Long projectId);
}
