package com.cn.ljh.dao.impl;

import com.cn.ljh.dao.CourseDao;
import com.cn.ljh.domain.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lijunhong on 16/8/17.
 */
@Service(value = "CourseDaoImplTest")
public class CourseDaoImpl implements CourseDao {
    @Resource
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void addCourse(Course course) {
        Session session = sessionFactory.getCurrentSession();
        session.save(course);
    }

    @Override
    public void delCourse(Long cid) {

    }

    @Override
    public void updateCourse(Course course) {

    }
}
