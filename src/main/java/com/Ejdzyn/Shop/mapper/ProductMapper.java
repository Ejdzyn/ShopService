package com.Ejdzyn.Shop.mapper;

import com.Ejdzyn.Shop.dto.ProductDto;
import com.Ejdzyn.Shop.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements Converter<Product, ProductDto> {

    @Override
    public Product convert(ProductDto from) {
        return Product.builder()
                .ean(from.getEan())
                .productName(from.getProductName())
                .quantity(from.getQuantity())
                .price(from.getPrice())
                .currency(from.getCurrency())
                .build();
    }
}
