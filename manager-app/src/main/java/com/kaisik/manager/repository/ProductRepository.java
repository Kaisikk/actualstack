package com.kaisik.manager.repository;

import com.kaisik.manager.entity.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAllProducts();

    Product save(Product product);
}
