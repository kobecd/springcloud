package com.rongyi.hla.service.product;

import com.rongyi.entity.product.Token;

/**
 * TokenService接口
 */
public interface TokenService {

    Integer save(Token token);

    Integer update(Token token);

    Token get(int id);
}
