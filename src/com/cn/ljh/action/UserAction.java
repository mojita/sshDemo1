package com.cn.ljh.action;

import com.cn.ljh.test.TestService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by lijunhong on 16/8/23.
 */
@Controller
public class UserAction extends ActionSupport implements Serializable{

    @Resource
    private TestService testService;



    @Override
    public String execute() throws Exception {
        System.out.println("测试-------action");
        testService.saveUser();
        return "success";
    }
}
