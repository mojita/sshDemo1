package com.cn.ljh.redis;

import org.testng.annotations.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by lijunhong on 16/8/19.
 */
public class RedisTest {

    @Test
    public void test1(){
        Jedis jedis = new Jedis("localhost");
        System.out.println("链接开始:--------------");
        System.out.println(jedis.ping());
        jedis.set("name","libai");
        String value = jedis.get("name");
        System.out.println(value);
    }



}
