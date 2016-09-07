package com.cn.ljh.domain;

import com.opensymphony.xwork2.ActionSupport;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by lijunhong on 16/8/17.
 */
public class Course extends ActionSupport implements Serializable {
    private Long cid;
    private String name;
    private Set<Student> students;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

}
