package com.cn.oa.service.impl;

import com.cn.oa.base.BaseDaoImpl;
import com.cn.oa.dao.DepartmentDao;
import com.cn.oa.domain.Department;
import com.cn.oa.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lijunhong on 16/8/26.
 */
@Service
@Transactional
public class DepartmentServiceImpl extends BaseDaoImpl<Department> implements DepartmentService {

    @Resource
    private DepartmentDao departmentDao;

    @Override
    public List<Department> findAll() {
        return departmentDao.findAll();
    }

    @Override
    public void delete(Long id) {
        departmentDao.delete(id);
    }

    @Override
    public Department getByID(Long id) {
        return departmentDao.getByID(id);
    }

    @Override
    public void update(Department department) {
        departmentDao.update(department);
    }

    @Override
    public void save(Department department) {
        departmentDao.save(department);
    }

    @Override
    public List<Department> findTopList() {
        return getSession().createQuery("FROM Department d where d.parent IS null").list();
    }
}
