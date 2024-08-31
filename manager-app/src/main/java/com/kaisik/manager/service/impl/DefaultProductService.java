package com.kaisik.manager.service.impl;

import com.kaisik.manager.entity.Product;
import com.kaisik.manager.repository.ProductRepository;
import com.kaisik.manager.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultProductService implements ProductService {

    private final ProductRepository productRepository;


    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAllProducts();
    }
}
