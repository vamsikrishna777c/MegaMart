package com.megaMart.repository;

import org.springframework.data.repository.CrudRepository;

import com.megaMart.Entity.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer>{

}
