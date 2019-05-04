package com.arc.jpa.repository;

import com.arc.jpa.model.domain.RR;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 叶超
 * @RunWith(SpringRunner.class)
 * @SpringBootTest
 * @Slf4j
 * @since 2019/4/30 11:09
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@Transactional //支持事物，@SpringBootTest 事物默认自动回滚
@ActiveProfiles("dev")
public class RRRepositoryTest {

    @Autowired
    private RRRepository rrRepository;

    @Test
    public void testList() {
        List<RR> rrs = rrRepository.listByRoleId(1L);
        System.out.println(rrs.size());
        System.out.println(rrs.size());
        System.out.println(rrs.size());
        System.out.println("------------------------------------------");
        rrs.stream().forEach((x) -> System.out.println(x));
        System.out.println("------------------------------------------");
    }


}
