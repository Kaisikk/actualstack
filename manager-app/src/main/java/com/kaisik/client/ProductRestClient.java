package com.kaisik.client;

import com.kaisik.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRestClient {

    List<Product> findAllProducts();

    Product createProduct(String title, String details);

    Optional<Product> findProduct(int productId);

    void updateProduct(int product, String title, String details);

    void deleteProduct(int productId);

}
