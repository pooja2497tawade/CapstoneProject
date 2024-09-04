package com.scaler.productservice.controller;

import com.scaler.productservice.dto.FakeStoreProductDto;
import com.scaler.productservice.model.Product;
import com.scaler.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    private RestTemplate restTemplate;

    @Autowired
    public ProductController(ProductService productService, RestTemplate restTemplate) {
        this.productService = productService;
        this.restTemplate = restTemplate;
    }

    @GetMapping // localhost:8080/products
    public List<Product> getAllProduct() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }

    @PostMapping
    public Product addNewProduct(@RequestBody FakeStoreProductDto productDto) {
//        Product p = new Product();
//        p.setTitle("A new product");
        return productService.addNewProduct(productDto);
    }
}
