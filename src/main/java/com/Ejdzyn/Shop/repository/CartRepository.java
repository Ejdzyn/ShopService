package com.Ejdzyn.Shop.repository;

import com.Ejdzyn.Shop.entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<Cart,Long> {
}
