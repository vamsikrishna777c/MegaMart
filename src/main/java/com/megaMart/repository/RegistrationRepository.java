package com.megaMart.repository;

import org.springframework.data.repository.CrudRepository;

import com.megaMart.Entity.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, String> {

}
