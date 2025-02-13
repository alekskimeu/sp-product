package com.product.sp_product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.product.sp_product.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
