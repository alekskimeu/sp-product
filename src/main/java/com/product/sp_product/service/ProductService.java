package com.product.sp_product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.sp_product.dto.ProductRequest;
import com.product.sp_product.model.Product;
import com.product.sp_product.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.descrption())
                .price(productRequest.price())
                .build();

        productRepository.save(product);
        log.info("Product created successfully");

        return product;
    }

}
