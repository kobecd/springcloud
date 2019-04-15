package com.arc.mp.service.system.impl;

import com.arc.mp.mapper.system.CardMapper;
import com.arc.mp.model.domain.system.Card;
import com.arc.mp.service.system.CardService;
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
    @Resource
    CardMapper cardMapper;


    @Override
    public List<Card> listByProjectId(Long projectId) {
        return cardMapper.listByProjectId(projectId);
    }

    @Override
    public List<Card> treeByProjectId(Long projectId) {
        List<Card> cardList = listByProjectId(projectId);
        List<Card> backList = new ArrayList<>(cardList.size());

        //数据按照level分层 level =1，2，3，4，，，

        //分三级 有多少级不知道 level

        //level -list 数据
        Map<Integer, List<Card>> map = new HashMap<>();


        //准备篮子
        if (cardList != null && cardList.size() > 0) {
            ArrayList<Integer> levels = new ArrayList<>();
            for (Card card : cardList) {
                levels.add(card.getLevel());
                map.put(card.getLevel(), new ArrayList<>());
            }

            //分级 装入篮子
            for (Card card : cardList) {
                map.get(card.getLevel()).add(card);
            }

            //自然升序
            levels.sort(Comparator.naturalOrder());

            //对于不同级别进行数据组装
            for (Integer level : levels) {
                for (Card root : map.get(level)) {
                    ArrayList<Card> childrenNodes = new ArrayList<>();
                    level++;
                    List<Card> nextNodes = map.get(level);
                    if (nextNodes != null) {
                        for (Card secondChildrenNode : nextNodes) {
                            log.debug("PId   ={}       ", root.getId());
                            log.debug("Next node is has PId={} ", secondChildrenNode.getParentId());
                            if (secondChildrenNode.getParentId().equals(root.getId())) { // 二级的父级code匹配的
                                secondChildrenNode.setParentName(root.getParentName());
                                childrenNodes.add(secondChildrenNode);
                            }
                        }
                    }

                    root.setChildren(childrenNodes);
                    backList.add(root);
                }
            }
        }
        return backList;
    }

    public List<Card> treeByProjectId1(Long projectId) {
        List<Card> cardList = listByProjectId(projectId);
        List<Card> backList = new ArrayList<>(cardList.size());

        //数据按照level分层 level =1，2，3，4，，，

        //分三级
        ArrayList<Card> roots = new ArrayList<>();
        ArrayList<Card> secondChildrenNodes = new ArrayList<>();
        ArrayList<Card> thirdChildrenNodes = new ArrayList<>();


        if (cardList != null && cardList.size() > 0) {
            for (Card card : cardList) {
//                int i = 1;
                if (card.getLevel() == 1) {
                    roots.add(card);
                } else if (card.getLevel() == 2) {
                    secondChildrenNodes.add(card);
                } else if (card.getLevel() == 3) {
                    thirdChildrenNodes.add(card);
                }
            }
        }


        for (Card root : roots) {
            ArrayList<Card> childrenForRoot = new ArrayList<>();
            for (Card secondChildrenNode : secondChildrenNodes) {
                log.debug("二级的父级code={} ", secondChildrenNode.getParentId());
                log.debug("根的code   ={}       ", root.getId());
                if (secondChildrenNode.getParentId().equals(root.getId())) { // 二级的父级code匹配的
                    secondChildrenNode.setParentName(root.getParentName());
                    childrenForRoot.add(secondChildrenNode);
                }
                ArrayList<Card> childrenForSecond = new ArrayList<>();
                for (Card thirdChildrenNode : thirdChildrenNodes) {
                    if (thirdChildrenNode.getParentId().equals(secondChildrenNode.getId())) {
                        thirdChildrenNode.setParentName(secondChildrenNode.getName());
                        childrenForSecond.add(thirdChildrenNode);
                    }
                }
                secondChildrenNode.setChildren(childrenForSecond);
            }
            root.setChildren(childrenForRoot);
            backList.add(root);
        }
        return backList;
    }
}
