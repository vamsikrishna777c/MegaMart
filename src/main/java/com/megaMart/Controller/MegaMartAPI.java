package com.megaMart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megaMart.DTO.CartDTO;
import com.megaMart.DTO.RegistrationDTO;
import com.megaMart.exception.MegaMartException;
import com.megaMart.service.MegaMartService;

@RestController
@RequestMapping
public class MegaMartAPI {
	@Autowired
	private MegaMartService service;
	@Autowired
	private Environment environment;
		@PostMapping("/user")
	    public ResponseEntity<String> registration(@RequestBody RegistrationDTO registration )throws MegaMartException{ 
		  service.registration(registration); 
		  String successMessage=environment.getProperty("API.REGISTRATION_SUCCESS") + registration.getName();
		  return new ResponseEntity<>(successMessage, HttpStatus.OK);
	    }
		@PostMapping("/login")
		public ResponseEntity<RegistrationDTO> userLogin(@RequestBody RegistrationDTO user) throws MegaMartException{
			RegistrationDTO u =service.userLogin(user.getEmailId(), user.getPassword());
			return new ResponseEntity<>(u, HttpStatus.OK);
		}
		@PostMapping("/cart")
		public ResponseEntity<String> addToCart(@RequestBody CartDTO cart) throws MegaMartException{
			service.addToCart(cart);
			String successMessage=environment.getProperty("API.PRODUCT_ADDED_SUCCESS");
			return new ResponseEntity<>(successMessage, HttpStatus.OK);
		}
	 

}
