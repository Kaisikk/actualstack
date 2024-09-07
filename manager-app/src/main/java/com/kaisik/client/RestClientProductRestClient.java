package com.kaisik.client;

import com.kaisik.entity.Product;
import com.kaisik.manager.controller.payload.NewProductPayload;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class RestClientProductRestClient implements ProductRestClient {

    private static final ParameterizedTypeReference<List<Product>> PRODUCTS_TYPE_REFERENCE =
            new ParameterizedTypeReference<List<Product>>() {
            };

    private final RestClient restClient;

    @Override
    public List<Product> findAllProducts() {
        return this.restClient
                .get()
                .uri("/catalogue-api/products/")
                .retrieve()
                .body(PRODUCTS_TYPE_REFERENCE);
    }

    @Override
    public Product createProduct(String title, String details) {
        return this.restClient
                .post()
                .uri("/catalogue-api/products/")
                .contentType(MediaType.APPLICATION_JSON)
                .body(new NewProductPayload(title, details))
                .retrieve()
                .body(Product.class);
    }

    @Override
    public Optional<Product> findProduct(int productId) {
        return Optional.empty();
    }

    @Override
    public void updateProduct(int product, String title, String details) {

    }

    @Override
    public void deleteProduct(int productId) {

    }
}
