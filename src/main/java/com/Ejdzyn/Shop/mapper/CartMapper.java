package com.Ejdzyn.Shop.mapper;

import com.Ejdzyn.Shop.dto.CartDto;
import com.Ejdzyn.Shop.dto.ProductDto;
import com.Ejdzyn.Shop.entity.Cart;
import com.Ejdzyn.Shop.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class CartMapper implements Converter<Cart, CartDto> {

    @Override
    public Cart convert(CartDto from) {
        return Cart.builder()
                .id(from.getId())
                .build();
    }
}
