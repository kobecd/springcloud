package com.antsoft.model;

import com.antsoft.database.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by Jason on 2017/3/2.
 */
@Table(name = "t_transactional_test")
public class TransactionalTest extends BaseEntity{

    String name;

    public TransactionalTest(String name) {
        this.name = name;
    }

    public TransactionalTest() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
