package com.Ejdzyn.Shop.repository;

import com.Ejdzyn.Shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>, CrudRepository<Product,Long> {

}
