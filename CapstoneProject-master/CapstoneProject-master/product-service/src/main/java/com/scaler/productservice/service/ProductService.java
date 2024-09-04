package com.scaler.productservice.service;

import com.scaler.productservice.dto.FakeStoreProductDto;
import com.scaler.productservice.model.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long id);
    List<Product> getAllProducts();

    Product addNewProduct(FakeStoreProductDto productDto);
}
