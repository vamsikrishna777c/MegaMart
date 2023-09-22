package com.megaMart.DTO;

import java.util.Objects;

public class CartDTO {
	
	private Integer cartId;
	private String productName;
	private String sellerName;
	private Integer quantity;
	private double cartOfferPrice;
	public CartDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CartDTO(Integer cartId, String productName, String sellerName, Integer quantity, double cartOfferPrice) {
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
		CartDTO other = (CartDTO) obj;
		return Objects.equals(cartId, other.cartId)
				&& Double.doubleToLongBits(cartOfferPrice) == Double.doubleToLongBits(other.cartOfferPrice)
				&& Objects.equals(productName, other.productName) && Objects.equals(quantity, other.quantity)
				&& Objects.equals(sellerName, other.sellerName);
	}
	@Override
	public String toString() {
		return "CartDTO [cartId=" + cartId + ", productName=" + productName + ", sellerName=" + sellerName
				+ ", quantity=" + quantity + ", cartOfferPrice=" + cartOfferPrice + "]";
	}
	

}
