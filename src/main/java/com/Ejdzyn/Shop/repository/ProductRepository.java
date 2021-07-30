package com.Ejdzyn.Shop.repository;

import com.Ejdzyn.Shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>, CrudRepository<Product,Long> {

    Optional<Product> findProductById(Long id);
    Optional<Product> findProductByEan(Long ean);

}
