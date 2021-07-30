package com.Ejdzyn.Shop.service;

import com.Ejdzyn.Shop.dto.ProductDto;
import com.Ejdzyn.Shop.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductDto> findAll();

    Optional<ProductDto> findProductByEan(Long ean);

    void addProduct(ProductDto product);

    boolean setProductQuantity(ProductDto product);

    boolean popProduct(ProductDto product);
}
