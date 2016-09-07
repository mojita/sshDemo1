package com.cn.ljh.dao.impl;

import com.cn.ljh.dao.StudentDao;
import com.cn.ljh.domain.Student;
import org.springframework.stereotype.Service;

/**
 * Created by lijunhong on 16/8/17.
 */
@Service
public class StudentDaoImpl implements StudentDao {
    @Override
    public void addStudent(Student student) {
        System.out.println("addStudent");
    }

    @Override
    public void delStudent(Long pid) {
        System.out.println("delStudent");
    }

    @Override
    public void updateStudent(Student student) {
        System.out.println("udateStudent");
    }
}
