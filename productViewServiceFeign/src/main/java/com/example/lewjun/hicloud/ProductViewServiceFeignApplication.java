package com.example.lewjun.hicloud;

import brave.sampler.Sampler;
import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//表示这是个 EurekaClient
@EnableEurekaClient
// 用于发现eureka 注册中心的微服务
@EnableDiscoveryClient
// 表示使用Feign方式
@EnableFeignClients
public class ProductViewServiceFeignApplication {
    public static void main(String[] args) {
        int port = 8201;
        while (!NetUtil.isUsableLocalPort(port)) {
            port++;
        }

        new SpringApplicationBuilder(ProductViewServiceFeignApplication.class)
                .properties("server.port=" + port)
                .run(args);
    }

    /**
     * 配置 Sampler 抽样策略： ALWAYS_SAMPLE 表示持续抽样
     */
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
