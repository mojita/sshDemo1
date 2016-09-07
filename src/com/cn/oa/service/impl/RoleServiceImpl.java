package com.cn.oa.service.impl;

import com.cn.oa.dao.RoleDao;
import com.cn.oa.domain.Role;
import com.cn.oa.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lijunhong on 16/8/24.
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDao roleDao;


    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

    @Override
    public void delete(Long id) {
        roleDao.delete(id);
    }

    @Override
    public void save(Role role) {
        roleDao.save(role);
    }

    @Override
    public Role getByID(Long id) {
        return roleDao.getByID(id);
    }

    @Override
    public void update(Role role) {
        roleDao.update(role);
    }
}
