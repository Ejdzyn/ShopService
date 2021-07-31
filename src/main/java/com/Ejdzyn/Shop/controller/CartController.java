package com.Ejdzyn.Shop.controller;

import com.Ejdzyn.Shop.dto.CartDto;
import com.Ejdzyn.Shop.service.CartService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/carts")
@AllArgsConstructor
public class CartController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CartController.class);

    private final CartService cartService;

    @Autowired

    @GetMapping()
    public ResponseEntity<List<CartDto>> getCarts() {
        LOGGER.info("Find all carts");

        List<CartDto> carts = cartService.findAll();

        return new ResponseEntity<>(carts,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addCart() {
        LOGGER.info("Find all carts");

        CartDto cart = CartDto.builder().id(123).build();

        cartService.addCart(cart);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
