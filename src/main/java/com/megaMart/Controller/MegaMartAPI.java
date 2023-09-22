package com.megaMart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	 

}
