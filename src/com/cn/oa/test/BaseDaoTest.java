package com.cn.oa.test;

import com.cn.oa.dao.RoleDao;
import com.cn.oa.dao.UserDao;
import com.cn.oa.dao.impl.RoleDaoImpl;
import com.cn.oa.dao.impl.UserDaoImpl;
import org.testng.annotations.Test;

/**
 * Created by lijunhong on 16/8/24.
 */
public class BaseDaoTest {

    @Test
    public void test1(){
        UserDao userDao = new UserDaoImpl();
        RoleDao roleDao = new RoleDaoImpl();
    }
}

