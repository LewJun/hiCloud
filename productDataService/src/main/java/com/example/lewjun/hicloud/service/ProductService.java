package com.example.lewjun.hicloud.service;

import com.example.lewjun.hicloud.bean.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<Product> listProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "p1 " + port, 21.3f));
        products.add(new Product(2, "p2 " + port, 22.3f));
        products.add(new Product(3, "p3 " + port, 23.3f));
        products.add(new Product(4, "p4 " + port, 24.3f));
        return products;
    }
}
