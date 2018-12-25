package com.antsoft.service;

import com.antsoft.mapper.TransactionalTestMapper;
import com.antsoft.model.TransactionalTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Jason on 2017/3/2.
 */
@Service
public class TransactionalTestService {
    @Autowired
    private TransactionalTestMapper transactionalTestMapper;

    @Transactional
    public int insertAll(List<TransactionalTest> transactionalTests){
//        transactionalTestMapper.insertList(transactionalTests);
        for(TransactionalTest transactionalTest:transactionalTests){
            transactionalTestMapper.insert(transactionalTest);
        }
        return transactionalTestMapper.selectCount(new TransactionalTest());
    }

}
