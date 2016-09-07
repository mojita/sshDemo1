package com.cn.oa.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

/**
 * Created by lijunhong on 16/8/24.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    @Resource
    private SessionFactory sessionFactory;
    protected Class<T> clazz;


    public BaseDaoImpl() {
        //通过反射得到T的真实类型
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        this.clazz = (Class<T>) parameterizedType.getActualTypeArguments()[0];
        System.out.println("clazz"+clazz.getName());
    }

    /**
     * 获取当前可用的session
     * @return
     */
   protected Session getSession(){
       return sessionFactory.getCurrentSession();
   }

    @Override
    public void save(T entity) {
        getSession().save(entity);
    }

    @Override
    public void delete(Long id) {
        Object obj = getSession().get(clazz,id);
        getSession().delete(obj);
    }

    @Override
    public void update(T entity) {
        getSession().update(entity);
    }

    @Override
    public T getByID(Long id) {
        if(id==null){
            return null;
        }
        return (T)getSession().get(clazz,id);
    }

    @Override
    public List<T> getByIDs(Long[] ids) {
        if(ids==null&&ids.length==0){
            return Collections.EMPTY_LIST;//避免空指针异常
        }
        return getSession().createQuery("FROM "+clazz.getSimpleName()+" WHERE id IN(:ids)").setParameterList("ids",ids).list();
    }

    @Override
    public List<T> findAll() {
        return getSession().createQuery("FROM "+clazz.getSimpleName()).list();
    }
}
