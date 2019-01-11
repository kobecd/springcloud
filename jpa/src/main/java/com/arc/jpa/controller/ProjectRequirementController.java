package com.arc.jpa.controller;

import com.arc.jpa.repository.ProjectRequirementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/10 15:12
 */
@Slf4j
@RestController
public class ProjectRequirementController {

    @Autowired
    private ProjectRequirementRepository projectRequirementRepository;

    @GetMapping("/list")
    public Object test() {
        return projectRequirementRepository.findAll();
    }

    @GetMapping("get")
    public Object get(@RequestParam String a,@RequestParam String b) {
        log.debug("###########\na={},b={}",a,b);
        return projectRequirementRepository.getByApplyExampleAndNote(a,b);
    }
}
