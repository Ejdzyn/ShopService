package com.Ejdzyn.Shop.mapper;

import com.Ejdzyn.Shop.dto.ProductDto;
import com.Ejdzyn.Shop.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductListMapper implements Converter<List<ProductDto>, List<Product>>{

    @Override
    public List<ProductDto> convert(List<Product> from) {
        return from.stream().map(product -> ProductDto.builder()
                .id(product.getId())
                .ean(product.getEan())
                .productName(product.getProductName())
                .quantity(product.getQuantity())
                .build())
                .collect(Collectors.toList());
    }
}
