package com.example.lewjun.hicloud.controller;

import com.example.lewjun.hicloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Object products() {
        return productService.listProducts();
    }
}
