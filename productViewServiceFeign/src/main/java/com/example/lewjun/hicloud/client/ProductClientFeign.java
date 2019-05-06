package com.example.lewjun.hicloud.client;

import com.example.lewjun.hicloud.bean.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
    @GetMapping("/products")
    List<Product> listProdcuts();
}
