package com.arc.jpa.repository;

import com.arc.jpa.model.domain.Role;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/30 11:15
 */
//todo mock
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

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
