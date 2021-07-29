package com.Ejdzyn.Shop.controller;

import com.Ejdzyn.Shop.dto.ProductDto;
import com.Ejdzyn.Shop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/api")
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/products")
    public ResponseEntity<List<ProductDto>> getProducts() {
        LOGGER.info("Find all products");

        List<ProductDto> products = productService.findAll();

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping(value = "/products/add")
    public ResponseEntity<Void> addProduct(ProductDto product) {
        LOGGER.info("Adding new product {}", product.getProductName());

        productService.addProduct(product);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/products/remove")
    public ResponseEntity<Void> pop(ProductDto product) {
        LOGGER.info("Removing {} product {}",product.getQuantity(), product.getProductName());

        productService.popProduct(product);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
