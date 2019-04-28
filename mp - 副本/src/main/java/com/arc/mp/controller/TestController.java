//package com.arc.mp.controller;
//
//import com.arc.mp.model.vo.ResponseVo;
//import com.arc.mp.service.CardService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
///**
// * 测试跳转以及数据返回用
// *
// * @author 叶超
// * @since 2018/12/26 11:28
// */
//@Slf4j
//@RestController
//@RequestMapping("/test")
//public class TestController {
//
//    @Autowired
//    private CardService cardService;
//
//    @GetMapping("/tree/{projectId}")
//    public ResponseVo treeByProjectId(@PathVariable Long projectId) {
//        long in = System.currentTimeMillis();
//
//
//        log.info("#################################");
//        List<Node> cards = cardService.treeByProjectId(projectId);
//        log.info("方法耗时={}ms", System.currentTimeMillis() - in);
//        log.info("#################################");
//        return ResponseVo.success(cards);
//    }
//
//
//    @GetMapping("/tree")
//    public Object tree() {
//        return LocalDateTime.now();
//    }
//
//
//}
