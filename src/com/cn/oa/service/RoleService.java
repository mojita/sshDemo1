package com.cn.oa.service;

import com.cn.oa.domain.Role;

import java.util.List;

/**
 * Created by lijunhong on 16/8/24.
 */
public interface RoleService {

    /**
     * 查询所有岗位信息
     * @return
     */
    List<Role> findAll();

    /**
     * 删除
     */
    void delete(Long id);

    /**
     * 保存role
     * @param role
     */
    void save(Role role);

    /**
     * 根据id获取role
     * @param id
     * @return
     */
    Role getByID(Long id);

    /**
     * 更新role信息
     * @param role
     */
    void update(Role role);
}
