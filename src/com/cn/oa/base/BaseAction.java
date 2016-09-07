package com.cn.oa.base;

import com.cn.oa.service.DepartmentService;
import com.cn.oa.service.RoleService;
import com.cn.oa.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;

/**
 * Created by lijunhong on 16/8/26.
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {


    protected T model;

    //方便子类访问
    @Resource
    protected RoleService roleService;
    @Resource
    protected DepartmentService departmentService;
    @Resource
    protected UserService userService;

    public BaseAction() {
        try {
            //获取实例对象
            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            Class clazz = (Class) pt.getActualTypeArguments()[0];
            model = (T) clazz.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public T getModel() {
        return model;
    }
}
