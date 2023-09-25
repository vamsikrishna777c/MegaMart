package com.megaMart.repository;

import org.springframework.data.repository.CrudRepository;

import com.megaMart.Entity.Order;

public interface OrderRepositroy extends CrudRepository<Order, String> {

}
