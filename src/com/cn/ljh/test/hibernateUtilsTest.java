package com.cn.ljh.test;

import com.cn.ljh.utils.HibernateUtils;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;

/**
 * Created by lijunhong on 16/8/17.
 */
public class hibernateUtilsTest extends HibernateUtils{

    @Test
    public void test1(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.buildSessionFactory();
    }

}