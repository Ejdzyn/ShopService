package com.Ejdzyn.Shop.mapper;

import com.Ejdzyn.Shop.dto.CartDto;
import com.Ejdzyn.Shop.entity.Cart;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CartListMapper implements Converter<List<CartDto>, List<Cart>> {

    @Override
    public List<CartDto> convert(List<Cart> from) {
        return from.stream().map(cart -> CartDto.builder()
                .id(cart.getId())
                .build())
                .collect(Collectors.toList());
    }
}
