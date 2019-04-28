package com.arc.mp.controller;

import com.arc.mp.model.domain.Card;
import com.arc.mp.model.domain.Node;
import com.arc.mp.service.CardService;
import com.arc.mp.service.CardService2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试跳转以及数据返回用
 *
 * @author 叶超
 * @since 2018/12/26 11:28
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private CardService cardService;

    @GetMapping("/tree/{projectId}")
    public Object treeByProjectId(@PathVariable Long projectId) {
        long in = System.currentTimeMillis();
        log.info("#################################");
        List<Node> cards = cardService.treeByProjectId(projectId);
        System.out.println(cards.size());
        log.info("方法耗时={}ms", System.currentTimeMillis() - in);
        log.info("#################################");
        return cards;
    }


    @Autowired
    private CardService2 cardService2;

    @GetMapping("/tree")
    public Object tree() {
        long in = System.currentTimeMillis();
        log.info("#################################");
        List<Card> cards = cardService2.treeByProjectId(1L);
        System.out.println(cards.size());
        log.info("方法耗时={}ms", System.currentTimeMillis() - in);
        log.info("#################################");
        return cards;
    }


}
