package com.megaMart.repository;

import org.springframework.data.repository.CrudRepository;

import com.megaMart.Entity.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

}
