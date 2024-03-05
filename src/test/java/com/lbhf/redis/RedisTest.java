package com.lbhf.redis;

import com.alibaba.fastjson.JSON;
import com.lbhf.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@SpringBootTest
public class RedisTest {
    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redistemplate;
    @Test
    public void testRedisTemplate(){
        User user = new User();
        user.setId(1);
        user.setName("LBHF");
        user.setAge(21);
        List<User> userList = new ArrayList<>();
        userList.add(user);
        redistemplate.opsForList().leftPush("User",userList);
        System.out.println(redistemplate.opsForList().range("User",0,-1));


    }
    @Test
    public void testRedisTemplate1(){
        User user = new User();
        user.setId(1);
        user.setName("路费");
        user.setAge(21);
        List<User> userList = new ArrayList<>();
        userList.add(user);
        String redis = JSON.toJSONString(userList);
        redistemplate.opsForHash().put("redis","orgDialog",redis);
        redistemplate.opsForHash().get("redis","orgDialog");
        List<User> users=JSON.parseArray((String) redistemplate.opsForHash().get("redis","orgDialog"),User.class);
        System.out.println(users);


    }
    @Test
    public void testUUID(){
        float a = (float)20/(float)100*100;
        String zgl = String.format("%.2f",a);
        System.out.println(zgl);
    }
    @Test
    public void testJedis(){
    }
}
