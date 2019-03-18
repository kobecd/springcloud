package com.xuwx.myorigin.controller;

import com.xuwx.myorigin.domain.SysQuartzJob;
import com.xuwx.myorigin.service.ISysQuartzJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by xuwx on 2018/11/29.
 */
@Controller
public class SysQuartzJobController {

    @Autowired
    private ISysQuartzJobService sysQuartzJobService;

    @RequestMapping("/SysQuartzJob")
    public String showAll(Map<String,Object> map)
    {
        List<SysQuartzJob> list = sysQuartzJobService.findList();
        map.put("jobs",list);
        return "SysQuartzJob/sysQuartzJob";
    }
}
