package com.rongyi.hla.service.product.impl;

import com.rongyi.hla.mapper.product.TokenMapper;
import com.rongyi.hla.service.product.TokenService;
import com.rongyi.model.product.Token;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

@Slf4j
@Service
public class TokenServiceImpl implements TokenService {


    @Autowired
    private TokenMapper tokenMapper;

   @Transactional
    @Override
    public Integer save(Token token) {
       tokenMapper.save(token);
       return token.getId();
    }

    @Override
    public Integer update(Token token) {
        return tokenMapper.update(token);
    }

    @Override
    public Token get(int id) {
        return tokenMapper.selectById(id);
    }
}
