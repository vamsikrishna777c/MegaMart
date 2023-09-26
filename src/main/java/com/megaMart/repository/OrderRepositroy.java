package com.megaMart.repository;

import org.springframework.data.repository.CrudRepository;

import com.megaMart.Entity.Order;
import com.megaMart.Entity.Product;

public interface OrderRepositroy extends CrudRepository<Order, String>{

}
