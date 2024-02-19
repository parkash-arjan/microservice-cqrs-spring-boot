package com.euler.product.service;

import com.euler.product.entity.Product;
import com.euler.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductQueryService {
    private final ProductRepository productRepository;

    public ProductQueryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
