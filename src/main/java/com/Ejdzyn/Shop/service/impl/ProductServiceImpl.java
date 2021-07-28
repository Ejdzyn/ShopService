package com.Ejdzyn.Shop.service.impl;

import com.Ejdzyn.Shop.dto.ProductDto;
import com.Ejdzyn.Shop.entity.Product;
import com.Ejdzyn.Shop.mapper.ProductListMapper;
import com.Ejdzyn.Shop.mapper.ProductMapper;
import com.Ejdzyn.Shop.repository.ProductRepository;
import com.Ejdzyn.Shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductListMapper productListMapper;
    private final ProductMapper productMapper;

    @Autowired

    @Override
    public List<ProductDto> findAll() {
        return productListMapper.convert(productRepository.findAll());
    }

    @Override
    public Optional<ProductDto> findProductByEan(Long ean) {
        return Optional.empty();
    }

    @Override
    public void addProduct(ProductDto product) {
        Optional<Product> optional = productRepository.findProductByEan(product.getEan());

        if(optional.isPresent()){

            Product p = optional.get();

            p.setQuantity(p.getQuantity()+ product.getQuantity());

            productRepository.save(p);
        }

        productRepository.save(productMapper.convert(product));

    }

    @Override
    public boolean setProductQuantity(ProductDto product){
        Optional<Product> optional = productRepository.findProductByEan(product.getEan());

        if(optional.isPresent()){
            Product p = optional.get();

            p.setQuantity(product.getQuantity());

            productRepository.save(p);
        }

        return optional.isPresent();

    }

    @Override
    public boolean popProduct(ProductDto product) {
        Optional<Product> optional = productRepository.findProductByEan(product.getEan());

        if (optional.isPresent()) {
            Product p = optional.get();

            p.setQuantity(p.getQuantity() - product.getQuantity());

        }

        return optional.isPresent();

    }
}
