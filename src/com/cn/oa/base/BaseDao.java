package com.cn.oa.base;

import java.util.List;

/**
 * Created by lijunhong on 16/8/24.
 */
public interface BaseDao<T> {

    /**
     * 保存实体
     * @param entity
     */
    void save(T entity);

    /**
     * 删除实体
     * @param id
     */
    void delete(Long id);

    /**
     * 更新实体
     * @param entity
     */
    void update(T entity);

    /**
     * 通过id查询实体
     * @param id
     * @return
     */
    T getByID(Long id);

    /**
     * 通过ids查询对应id的实体对象
     * @param ids
     * @return
     */
    List<T> getByIDs(Long[] ids);

    /**
     * 获取所有的实体对象
     * @return
     */
    List<T> findAll();

}
