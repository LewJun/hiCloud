package com.example.lewjun.hicloud.service;

import com.example.lewjun.hicloud.bean.Product;
import com.example.lewjun.hicloud.client.ProductClientRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts() {
        return productClientRibbon.listProdcuts();
    }
}
