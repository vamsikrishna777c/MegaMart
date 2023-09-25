package com.megaMart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megaMart.DTO.ProductDTO;
import com.megaMart.exception.MegaMartException;
import com.megaMart.service.MegaMartService;

@RestController
@RequestMapping(value="mega-mart")
public class MegaMartAPI {

	@Autowired
	private MegaMartService megaMartService;
	@PostMapping(value="/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody ProductDTO productDTO) throws MegaMartException {
		String addProduct = megaMartService.addProduct(productDTO);
		return new ResponseEntity<>("ADDED "+ addProduct + " SUCCESSFULLY", HttpStatus.CREATED);
	}
	
}
