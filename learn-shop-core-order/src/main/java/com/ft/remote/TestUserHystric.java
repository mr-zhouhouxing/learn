package com.ft.remote;

import org.springframework.stereotype.Component;

/**
 * 测试熔断器
 *
 * @author liuyongtao
 * @create 2018-01-29 9:25
 */
@Component
public class TestUserHystric implements TestUserRemote {

    @Override
    public String indexClient(String name) {
        System.out.println("TestUserHystric");
        return "sorry:" + name;
    }
}