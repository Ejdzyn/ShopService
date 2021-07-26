package com.Ejdzyn.Shop.service.impl;

import com.Ejdzyn.Shop.dto.ProductDto;
import com.Ejdzyn.Shop.mapper.ProductListMapper;
import com.Ejdzyn.Shop.repository.ProductRepository;
import com.Ejdzyn.Shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductListMapper productListMapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductListMapper productListMapper) {
        this.productRepository = productRepository;
        this.productListMapper = productListMapper;
    }

    @Override
    public List<ProductDto> findAll() {
        return productListMapper.convert(productRepository.findAll());
    }
}
