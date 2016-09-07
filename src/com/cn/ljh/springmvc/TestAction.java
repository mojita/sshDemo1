package com.cn.ljh.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lijunhong on 16/8/29.
 */
@Controller
@RequestMapping("/test")
public class TestAction {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
