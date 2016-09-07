package com.cn.ljh.dao;

import com.cn.ljh.domain.Course;

/**
 * Created by lijunhong on 16/8/17.
 */
public interface CourseDao {

    public void addCourse(Course course);

    public void delCourse(Long cid);

    public void updateCourse(Course course);
}
