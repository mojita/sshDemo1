package com.cn.ljh.domain;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by lijunhong on 16/8/17.
 */
@Service
public class Student extends ActionSupport implements Serializable {
    private Long sid;
    private String name;
    private String sex;
    private int age;
    private Course course;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
