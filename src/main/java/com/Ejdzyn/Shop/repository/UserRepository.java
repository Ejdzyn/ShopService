package com.Ejdzyn.Shop.repository;

import com.Ejdzyn.Shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>, CrudRepository<User,Long> {

}
