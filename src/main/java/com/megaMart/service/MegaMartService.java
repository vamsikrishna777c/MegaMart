package com.megaMart.service;

import com.megaMart.DTO.RegistrationDTO;
import com.megaMart.exception.MegaMartException;

public interface MegaMartService {
	public void registration(RegistrationDTO registration) throws MegaMartException;
}
