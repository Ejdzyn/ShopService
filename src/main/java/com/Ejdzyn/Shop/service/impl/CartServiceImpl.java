package com.Ejdzyn.Shop.service.impl;

import com.Ejdzyn.Shop.dto.CartDto;
import com.Ejdzyn.Shop.entity.Cart;
import com.Ejdzyn.Shop.mapper.CartListMapper;
import com.Ejdzyn.Shop.mapper.CartMapper;
import com.Ejdzyn.Shop.repository.CartRepository;
import com.Ejdzyn.Shop.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final CartMapper cartMapper;
    private final CartListMapper cartListMapper;

    @Override
    public List<CartDto> findAll() {
        return cartListMapper.convert(cartRepository.findAll());
    }

    @Override
    public void addCart(CartDto cart){

        cartRepository.save(cartMapper.convert(cart));
    }
}
