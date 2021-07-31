package com.Ejdzyn.Shop.service;

import com.Ejdzyn.Shop.dto.CartDto;
import com.Ejdzyn.Shop.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface CartService {

    List<CartDto> findAll();

    void addCart(CartDto cart);
}
