package com.arc.mp.service.system;


import com.arc.mp.model.domain.system.Card;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/15 15:44
 */
public interface CardService {

    List<Card> listByProjectId(Long projectId);

    List<Card> treeByProjectId(Long projectId);
}
