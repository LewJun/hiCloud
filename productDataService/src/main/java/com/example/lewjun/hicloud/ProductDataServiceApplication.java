package com.example.lewjun.hicloud;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ProductDataServiceApplication
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductDataServiceApplication {
    public static void main(String[] args) {
        int port = 8001;
//        如果端口正在备用，我们就将端口加1
        while (!NetUtil.isUsableLocalPort(port)) {
            port++;
        }
        new SpringApplicationBuilder(ProductDataServiceApplication.class)
                .properties("server.port=" + port)
                .run(args);
    }
}
