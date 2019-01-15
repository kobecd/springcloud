package com.rongyi.hla.service.product.impl;

import com.rongyi.dto.product.ProductDTO;
import com.rongyi.hla.mapper.product.ProductMapper;
import com.rongyi.hla.service.product.ProductService;
import com.rongyi.model.product.Product;
import com.rongyi.query.product.ProductQuery;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.SQLWarningException;
import org.springframework.stereotype.Service;

import java.sql.SQLWarning;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
    Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductMapper productMapper;


    @Override
    public Long save(Product product) {
        if (productMapper.save(product) == 1) {
            return product.getId();
        } else {
            log.error("保存数据错误");
            throw new SQLWarningException("", new SQLWarning("保存数据错误"));
        }
    }

    @Override
    public int delete(Long id) {
        return productMapper.delete(id);
    }

    @Override
    public int update(Product product) {
        return productMapper.update(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.get(id);
    }


    @Override
    public List<Product> list(ProductDTO productDTO) {
        return productMapper.list();
    }

    @Override
    public List<Product> list() {
        return productMapper.list();
    }

    @Override
    public List<Product> page(ProductQuery query) {
//        productMapper.getCount(query);
//        List<Product> products = productMapper.listPage(query);

        return productMapper.listPage(query);
    }
}
