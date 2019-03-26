package com.arc.test.test.reflect;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author: 叶超
 * @since: 2019/2/19 9:30
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Man {

    private String name;
    private int sex;
    private String idCard;
    private float salary;


    private String password;
    private Integer age;
    private Date updateDate;

    public Man(String name, int sex, String idCard, float salary) {
        super();
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


}
