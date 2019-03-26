package com.arc.test.test.value;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 叶超
 * @since 2019/3/26 16:30
 */
@Slf4j
@RestController
@RequestMapping("/value")
public class TestImportValueFromYmlController {

    @Value("${my.key:AAA}")
    private String name;

    //–file:./config/
    //–file:./
    //–classpath:/config/
    //–classpath:/
    //以上是按照优先级从高到低的顺序，所有位置的文件都会被加载，高优先级配置内容会覆盖低优先级配置内容。
    //
    //SpringBoot会从这四个位置全部加载主配置文件，如果高优先级中配置文件属性与低优先级配置文件不冲突的属性，则会共同存在—互补配置。
    //我们也可以通过配置spring.config.location来改变默认配置。
    //
    //java -jar spring-boot-02-config-02-0.0.1-SNAPSHOT.jar
    //--spring.config.location=D:/application.yml
    //https://blog.csdn.net/seapeak007/article/details/53490156
    //配置  https://blog.csdn.net/J080624/article/details/80508606



    /**
     * 测试为合并的多个单元格赋值，并为合并的单元格设置样式
     * 注意：同一行上的只能创建同一个行对象row  否则赋值的内容会被覆盖。
     */
    @GetMapping("/v1")
    public String testGetValue() {
        long start = System.currentTimeMillis();
        log.info("##############################");
        log.info("耗时={} ms ", System.currentTimeMillis() - start);
        log.info("##############################");
        return  name ;
    }

}
