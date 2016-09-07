package com.cn.oa.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lijunhong on 16/8/24.
 */
public class Role {

    private Long        id;
    private String      name;
    private String      description;
    private Set<User>   users = new HashSet<>();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
