package com.megaMart.service;

import com.megaMart.DTO.CartDTO;
import com.megaMart.DTO.RegistrationDTO;
import com.megaMart.exception.MegaMartException;

public interface MegaMartService {
	public void registration(RegistrationDTO registration) throws MegaMartException;
	public RegistrationDTO userLogin(String emailId, String password) throws MegaMartException;
	public void addToCart(CartDTO cart) throws MegaMartException;

}
