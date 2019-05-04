package com.arc.jpa.repository;

import com.arc.jpa.model.domain.Role;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/30 11:15
 */
//todo mock
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@Transactional //支持事物，@SpringBootTest 事物默认自动回滚
@Rollback // 事务自动回滚，不自动回滚@Rollback(false)
public class RoleRepositoryTest {

    //Transactional
    //Spring has defined its own Transactional annotation to make Spring bean methods transactional, years ago.
    //
    //Java EE 7 has finally done the same thing and now allows CDI bean methods to be transactional, in addition to EJB methods. So since Java EE 7, it also defines its own Transactional annotation (it obviously can't reuse the Spring one).
    //
    //In a Java EE 7 application, you'll use the Java EE annotation.
    //
    //In a Spring application, you'll use the Spring annotation.
    //
    //Their use is the same: informing the container (Java EE or Spring) that a method is transactional.

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testSave() {
        Role role = new Role("admin", 1);
        Role save = roleRepository.save(role);
        System.out.println(save);
        Assert.assertNotNull(save);
    }

    @Test
    public void testDelete() {

        roleRepository.deleteById(60L);

    }

    @Test
    public void testList() {
        List<Role> all = roleRepository.findAll();
        System.out.println(all.size());
        System.out.println(all.size());
        System.out.println(all.size());

        System.out.println("------------------------------------------");
//        all.stream().forEach((item)-> System.out.println(item));
        all.stream().forEach(System.out::println);

    }

}
