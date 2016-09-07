package com.cn.ljh.test;

import com.cn.ljh.dao.StudentDao;
import com.cn.ljh.dao.impl.StudentDaoImpl;
import com.cn.ljh.domain.Student;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by lijunhong on 16/8/17.
 */
public class SpringTest {

//    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       StudentDao studentDao = (StudentDao)context.getBean("studentDaoImpl");
        studentDao.addStudent(new Student());
    }

    @Test
    public void test22(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = (StudentDao)context.getBean("studentDao");
        studentDao.addStudent(new Student());
    }

    @Test
    public void test23(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDaoImpl studentDao = (StudentDaoImpl)context.getBean("studentDaoImpl");
    }

    /**
     * 测试SessionFactory
     */
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactory");
        System.out.println(sessionFactory.openSession());
    }


    /**
     * 测试事务
     */
    @Test
    public void test4(){
//        TestService testService = (TestService)applicationContext.getBean("testService");
//        testService.saveTwoUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService testService = (TestService)context.getBean("testService");
        testService.saveUser();
   }

   @Test
    public void test5(){
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       TestService testService = (TestService)context.getBean("testService");
       System.out.println(testService);

   }

}
