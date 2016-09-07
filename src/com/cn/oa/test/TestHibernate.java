package com.cn.oa.test;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by lijunhong on 16/8/24.
 */
public class TestHibernate {

    private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void testCreateTable(){
        SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactory");
        sessionFactory.openSession();
    }
}
