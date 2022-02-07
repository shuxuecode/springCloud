package com.zsx.client.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zsx
 */
public class RequestDto implements Serializable {

    private static final long serialVersionUID = 5751232279525397604L;

    private Long id;

    private String name;

    private Integer age;

    private Date birthday;

    // getter setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
