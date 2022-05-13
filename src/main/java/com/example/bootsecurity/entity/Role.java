package com.example.bootsecurity.entity;

import java.io.Serializable;

/**
 * @ClassName: Role
 * @Description:
 * @date: 2022/5/10 13:33
 * @version: 1.0.0
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 825384782616737527L;

    private Integer id;

    private String name;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}