package com.arc.mp.mapper.system;


import com.arc.mp.model.domain.Card;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/15 15:29
 */
public interface CardMapper {

    int save(Card card);

    int delete(Long id);

    int update(Card card);

    Card get(Long id);

    List<Card> list();

    List<Card> listByProjectId(@Param("projectId") Long projectId);
}
