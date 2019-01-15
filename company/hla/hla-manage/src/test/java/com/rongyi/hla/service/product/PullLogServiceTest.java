package com.rongyi.hla.service.product;

import com.rongyi.enums.product.PullName;
import com.rongyi.entity.product.PullLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
@SpringBootTest
public class PullLogServiceTest {

    //    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
    @Autowired
    private PullLogService pullLogService;

    @Test
    public void save() {
        PullLog pullLog = new PullLog();
        pullLog.setName(PullName.SKU.toString());
        pullLog.setOperator("lamy");
        pullLog.setRemark("c11111");
        pullLog.setSuccess(true);
        pullLog.setRequestDate(new Date());
        Integer save = pullLogService.save(pullLog);
        Assert.assertNotNull(save);

    }

    @Test
    public void list() {
        List<PullLog> list = pullLogService.list();
        Assert.assertNotNull(list);
    }
}