package com.rongyi.hla.mapper.product;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rongyi.model.product.Token;

public interface TokenMapper extends BaseMapper<Token> {

    
    Integer update(Token token);

    Integer save(Token token);
}
