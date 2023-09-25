package com.megaMart.Entity;

import java.util.Date;
import java.util.Objects;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	/*
	 * @GenericGenerator(name = "orderId", strategy =
	 * "com.eframe.model.generator.ClientIdGenerator")
	 * 
	 * @GeneratedValue(generator = "orderId")
	 */
	String orderId;
	String displayName;
	String category;
	String sellerName;
	double price;
	int quantity;
	double totalPrice;
	Date orderedDate;
	String orderStatus;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(String orderId, String displayName, String category, String sellerName, double price, int quantity,
			double totalPrice, Date orderedDate, String orderStatus) {
		super();
		this.orderId = orderId;
		this.displayName = displayName;
		this.category = category;
		this.sellerName = sellerName;
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.orderedDate = orderedDate;
		this.orderStatus = orderStatus;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, displayName, orderId, orderStatus, orderedDate, price, quantity, sellerName,
				totalPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(category, other.category) && Objects.equals(displayName, other.displayName)
				&& Objects.equals(orderId, other.orderId) && Objects.equals(orderStatus, other.orderStatus)
				&& Objects.equals(orderedDate, other.orderedDate)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity
				&& Objects.equals(sellerName, other.sellerName)
				&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice);
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", displayName=" + displayName + ", category=" + category + ", sellerName="
				+ sellerName + ", price=" + price + ", quantity=" + quantity + ", totalPrice=" + totalPrice
				+ ", orderedDate=" + orderedDate + ", orderStatus=" + orderStatus + "]";
	}
	
	
}
