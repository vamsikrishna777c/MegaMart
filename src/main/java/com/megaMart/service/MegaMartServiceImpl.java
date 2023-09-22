package com.megaMart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megaMart.DTO.RegistrationDTO;
import com.megaMart.Entity.Registration;
import com.megaMart.exception.MegaMartException;
import com.megaMart.repository.RegistrationRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class MegaMartServiceImpl implements MegaMartService{
	@Autowired
	private RegistrationRepository registrationRepository;

	@Override
	public void registration(RegistrationDTO registration) throws MegaMartException {
		// TODO Auto-generated method stub
		Registration user = new Registration();
		user.setEmailId(registration.getEmailId());
		user.setName(registration.getName());
		user.setPassword(registration.getPassword());
		registrationRepository.save(user);
		
	}

}
