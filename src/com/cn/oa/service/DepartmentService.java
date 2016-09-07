package com.cn.oa.service;

import com.cn.oa.domain.Department;

import java.util.List;

/**
 * Created by lijunhong on 16/8/26.
 */
public interface DepartmentService {

    List<Department> findAll();

    void delete(Long id);

    Department getByID(Long id);

    void update(Department department);

    void save(Department department);

    List<Department> findTopList();
}
