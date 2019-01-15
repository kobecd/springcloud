package com.rongyi.hla.mapper.product;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rongyi.entity.product.Token;

public interface TokenMapper extends BaseMapper<Token> {


    Integer update(Token token);

    Integer save(Token token);
}
