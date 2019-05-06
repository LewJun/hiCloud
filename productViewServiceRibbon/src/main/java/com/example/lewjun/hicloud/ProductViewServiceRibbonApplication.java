package com.example.lewjun.hicloud;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//表示这是个 EurekaClient
@EnableEurekaClient
// 用于发现eureka 注册中心的微服务
@EnableDiscoveryClient
public class ProductViewServiceRibbonApplication {
    public static void main(String[] args) {
        int port = 8101;
        while (!NetUtil.isUsableLocalPort(port)) {
            port++;
        }

        new SpringApplicationBuilder(ProductViewServiceRibbonApplication.class)
                .properties("server.port=" + port)
                .run(args);
    }

    //    用 restTemplate 这个工具来做负载均衡
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
