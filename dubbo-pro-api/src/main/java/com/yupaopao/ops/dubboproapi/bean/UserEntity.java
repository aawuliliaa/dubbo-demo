package com.yupaopao.ops.dubboproapi.bean;

import java.io.Serializable;
//一定要实现Serializable ，否则报错
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 121L;
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
