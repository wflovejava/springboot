package com.wf.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wf
 * @Date: 2020-03-01 17:16
 * @describe 启动类
 */
@SpringBootApplication
@RestController

public class WfNacosConfigApplication {
    public static void main(String[] args) {

        SpringApplication.run(WfNacosConfigApplication.class);
    }
}
