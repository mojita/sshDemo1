package com.cn.oa.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lijunhong on 16/8/25.
 * 部门
 */
public class Department {
    private Long                id;
    private Department          parent;
    private String              name;
    private String              description;
    private Set<User>           users = new HashSet<>();
    private Set<Department>     children = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Department getParent() {
        return parent;
    }

    public void setParent(Department parent) {
        this.parent = parent;
    }

    public Set<Department> getChildren() {
        return children;
    }

    public void setChildren(Set<Department> children) {
        this.children = children;
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
