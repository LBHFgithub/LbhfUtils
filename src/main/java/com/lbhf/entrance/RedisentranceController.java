package com.lbhf.entrance;

import com.lbhf.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/RedisUtil")
public class RedisentranceController {
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/getName")
    public Map<String,Object> getRedis(@RequestParam Map<String,Object> map){
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("name",redisUtil.get(map.get("name").toString()));
        return objectObjectHashMap;

    }
    @RequestMapping("/setName")
    public String setRedis(@RequestParam Map<String,Object> map){
        String key = (String) map.get("key");
        String value = (String) map.get("value");
        redisUtil.set(key,value);
        return "请求成功！";
    }
}
