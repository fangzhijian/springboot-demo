package com.springboot.demo;

import com.alibaba.fastjson2.JSONObject;
import com.springboot.demo.model.po.user.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * 2020/4/26 15:09
 * fzj
 */
@Slf4j
public class DemoTest {

    @Test
    public void test1() {
        String uri = "http://localhost:8868/test1";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("password","123456");
        User user = new User();
        user.setPassword("123456");

        JSONObject block = WebClient.builder().build().get().uri("http://localhost:8868/test1",uriBuilder ->
                        uriBuilder.queryParam("name","张三")
                                .queryParam("apiToken","1222")
                                .build())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve().bodyToMono(JSONObject.class).block();
        System.out.println(block);
    }



    @Test
    public void test2() {

    }

    @Test
    public void test3() {
    }
}
