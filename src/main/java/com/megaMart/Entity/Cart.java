package com.megaMart.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartId;
	private String productName;
	private String sellerName;
	private Integer quantity;
	private double cartOfferPrice;
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	public Cart(Integer cartId, String productName, String sellerName, Integer quantity, double cartOfferPrice) {
		super();
		this.cartId = cartId;
		this.productName = productName;
		this.sellerName = sellerName;
		this.quantity = quantity;
		this.cartOfferPrice = cartOfferPrice;
	}

	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getCartOfferPrice() {
		return cartOfferPrice;
	}
	public void setCartOfferPrice(double cartOfferPrice) {
		this.cartOfferPrice = cartOfferPrice;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cartId, cartOfferPrice, productName, quantity, sellerName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return Objects.equals(cartId, other.cartId)
				&& Double.doubleToLongBits(cartOfferPrice) == Double.doubleToLongBits(other.cartOfferPrice)
				&& Objects.equals(productName, other.productName) && Objects.equals(quantity, other.quantity)
				&& Objects.equals(sellerName, other.sellerName);
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", productName=" + productName + ", sellerName=" + sellerName + ", quantity="
				+ quantity + ", cartOfferPrice=" + cartOfferPrice + "]";
	}
	

}
