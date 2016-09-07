package com.cn.ljh.test;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lijunhong on 16/8/23.
 */
public class TestAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("---------cheng");
        return "success";
    }
}
