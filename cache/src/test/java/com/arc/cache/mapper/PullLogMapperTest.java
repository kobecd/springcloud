package com.arc.cache.mapper;

import com.arc.cache.model.domain.PullLog;
import com.arc.cache.model.query.PullLogQuery;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/11/11 16:14
 * @description:
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class PullLogMapperTest {

    @Resource
    PullLogMapper pullLogMapper;

    @Test
    public void save() {
    }

    @Test
    public void get() {
    }

    @Test
    public void list() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void listByPullLogQuery() {

        List<PullLog> logs = pullLogMapper.listByPullLogQuery(new PullLogQuery("SYNCHRONIZE_SKU"));
        log.debug("结果={}", logs);
        log.debug("结果={}", logs);
        log.debug("结果={}", logs);
    }
}
