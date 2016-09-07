package com.cn.ljh.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lijunhong on 16/8/23.
 */
public class TestAction extends ActionSupport {

    public String add(){
        System.out.println("adddd--------");
        return SUCCESS;
    }
}
