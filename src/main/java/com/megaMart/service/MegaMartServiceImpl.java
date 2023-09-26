package com.megaMart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megaMart.DTO.CartDTO;
import com.megaMart.DTO.RegistrationDTO;
import com.megaMart.Entity.Cart;
import com.megaMart.Entity.Registration;
import com.megaMart.exception.MegaMartException;
import com.megaMart.repository.CartRepository;
import com.megaMart.repository.RegistrationRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class MegaMartServiceImpl implements MegaMartService{
	@Autowired
	private RegistrationRepository repository;
	@Autowired
	private CartRepository cartRepository;

	@Override
	public void registration(RegistrationDTO registration) throws MegaMartException {
		// TODO Auto-generated method stub
		Registration user = new Registration();
		user.setEmailId(registration.getEmailId());
		user.setName(registration.getName());
		user.setPassword(registration.getPassword());
		repository.save(user);
		
	}

	@Override
	public RegistrationDTO userLogin(String emailId, String password) throws MegaMartException{
		// TODO Auto-generated method stub
		Optional<Registration> opt = repository.findById(emailId);
		Registration user = opt.orElseThrow(()->new MegaMartException("Service.USER_NOT_FOUND"));
		RegistrationDTO u = new RegistrationDTO();
		u.setEmailId(user.getEmailId());
		u.setName(user.getName());
		u.setPassword(user.getPassword());
		if(u.getPassword().equals(password)) {
			return u;
		}else throw new MegaMartException("Service.PASSWORD_NOT_VALID");
		
	}

	@Override
	public void addToCart(CartDTO c) throws MegaMartException {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setCartId(c.getCartId());
		cart.setQuantity(c.getQuantity());
		cart.setCartOfferPrice(c.getCartOfferPrice());
		cart.setProductName(cart.getProductName());
		cart.setSellerName(c.getSellerName());
		cartRepository.save(cart);
		
	}

}
