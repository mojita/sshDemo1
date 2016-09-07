package com.cn.ljh.dao;

import com.cn.ljh.domain.Student;

/**
 * Created by lijunhong on 16/8/17.
 */
public interface StudentDao {

    public void addStudent(Student student);

    public void delStudent(Long pid);

    public void updateStudent(Student student);


}
