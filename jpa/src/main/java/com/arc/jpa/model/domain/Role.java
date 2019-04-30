package com.arc.jpa.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 叶超
 * @since 2019/4/30 11:06
 */
@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "state")
    private Integer state;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;
}
