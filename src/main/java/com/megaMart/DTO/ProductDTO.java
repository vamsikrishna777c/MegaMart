package com.megaMart.DTO;

import java.util.Objects;

public class ProductDTO {

	String productId;
	String productName;
	String description;
	double price;
	double discount;
	double deliveryCharges;
	int avgRating;
	String sellerName;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductDTO(String productId, String productName, String description, double price, double discount,
			double deliveryCharges, int avgRating, String sellerName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.deliveryCharges = deliveryCharges;
		this.avgRating = avgRating;
		this.sellerName = sellerName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	public int getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(avgRating, deliveryCharges, description, discount, price, productId, productName,
				sellerName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		return avgRating == other.avgRating
				&& Double.doubleToLongBits(deliveryCharges) == Double.doubleToLongBits(other.deliveryCharges)
				&& Objects.equals(description, other.description)
				&& Double.doubleToLongBits(discount) == Double.doubleToLongBits(other.discount)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& Objects.equals(sellerName, other.sellerName);
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", discount=" + discount + ", deliveryCharges=" + deliveryCharges
				+ ", avgRating=" + avgRating + ", sellerName=" + sellerName + "]";
	}
}
