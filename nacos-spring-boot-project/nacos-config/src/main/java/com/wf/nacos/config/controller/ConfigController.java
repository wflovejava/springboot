package com.wf.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wf
 * @Date: 2020-03-01 17:23
 * @describe 测试配置中心动态刷新
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${username:lily}")
    private String username;

    @RequestMapping("/username")
    public String get() {
        return username;
    }
}
