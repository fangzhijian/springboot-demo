package com.springboot.demo;

import com.alibaba.fastjson2.JSON;
import com.springboot.demo.config.ManageApplication;
import com.springboot.demo.model.po.TestData;
import com.springboot.demo.service.TestDataService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * 2020/6/2 10:27
 * fzj
 */
@SpringBootTest(classes = ManageApplication.class)
@Slf4j
public class SpringTest {

    @Resource
    private TestDataService testDataService;
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void test() {
        redisTemplate.opsForValue().set("test", "abc");
        Object test = redisTemplate.opsForValue().get("test");
        System.out.println(test);
    }

}
