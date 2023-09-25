package com.megaMart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megaMart.DTO.OrderDTO;
import com.megaMart.DTO.ProductDTO;
import com.megaMart.DTO.RegistrationDTO;
import com.megaMart.Entity.Product;
import com.megaMart.Entity.Registration;
import com.megaMart.exception.MegaMartException;
import com.megaMart.repository.OrderRepositroy;
import com.megaMart.repository.ProductRepository;
import com.megaMart.repository.RegistrationRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class MegaMartServiceImpl implements MegaMartService{
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void registration(RegistrationDTO registration) throws MegaMartException {
		// TODO Auto-generated method stub
		Registration user = new Registration();
		user.setEmailId(registration.getEmailId());
		user.setName(registration.getName());
		user.setPassword(registration.getPassword());
		registrationRepository.save(user);
		
	}
	
	public String addProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		// Add products to the database
		Product product = new Product();
		ProductDTO addProduct = new ProductDTO();
		product.setProductId(productDTO.getProductId());
		product.setProductName(productDTO.getProductName());
		product.setDescription(productDTO.getDescription());
		product.setPrice(productDTO.getPrice());
		product.setDiscount(productDTO.getDiscount());
		product.setDeliveryCharges(productDTO.getDeliveryCharges());
		product.setAvgRating(productDTO.getAvgRating());
		product.setSellerName(productDTO.getSellerName());
		return productRepository.save(product).getProductName();
	}

}
