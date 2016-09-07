package com.cn.ljh.test;

import com.cn.ljh.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lijunhong on 16/8/22.
 */

//@Repository //持久化层管理
//@Controller //servlet层管理
//@Component  //具体不好分层的管
//@Transactional
@Service    //service层管理
public class TestService {


    @Resource
    private SessionFactory sessionFactory;


    @Transactional
    public void saveUser(){


        Session session = sessionFactory.getCurrentSession();

        session.save(new User());

        int i = 1/0;  //这里抛出异常

        session.save(new User());
        System.out.println(session);
    }
}
