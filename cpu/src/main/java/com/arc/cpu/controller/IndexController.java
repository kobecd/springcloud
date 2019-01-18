package com.arc.cpu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/18 9:18
 */
@Controller
@Slf4j
public class IndexController {


    @RequestMapping("")
    @ResponseBody
    public String index() {
        transferDataToDb();

        return "success";
    }

    public static void main(String[] args) {
        transferDataToDb();

    }

    private static void transferDataToDb() {
        String raw = "AMD Ryzen 3 PRO 2200G  + Compare\tAverage CPU Mark\n" +
                "Description: with Radeon Vega Graphics\n" +
                "Socket: AM4\n" +
                "Clockspeed: 3.5 GHz\n" +
                "Turbo Speed: 3.7 GHz\n" +
                "No of Cores: 4\n" +
                "Typical TDP: 65 W\n" +
                "\n" +
                "Other names:  AMD Ryzen 3 PRO 2200G with Radeon Vega Graphics\n" +
                "CPU First Seen on Charts:  Q1 2018\n" +
                "CPUmark/$Price:  NA     Overall Rank:  441\n" +
                "Last Price Change:  NA\n" +
                "8060\n" +
                "\n" +
                "Single Thread Rating: 1930\n" +
                "Samples: 32*\n" +
                "*Margin for error: Low\n";

        String replace = raw.replace("\n", "");
        System.out.println(replace);
        System.out.println(replace);
    }


}
