package com.cn.ljh.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by lijunhong on 16/8/24.
 */
public class TestLog {

//    private Log logger = LogFactory.getLog(TestLog.class);
    private Logger logger = LoggerFactory.getLogger(TestLog.class);
    @Test
    public void test1(){
        logger.info("info信息");
        logger.debug("debug信息");
        logger.warn("warn信息");
        logger.error("error信息");
        logger.trace("fatal信息");
    }
}
