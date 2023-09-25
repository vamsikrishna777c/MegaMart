package com.megaMart.DTO;

import java.util.Objects;

public class WishListDTO {

	String wishId;
	String displayName;
	String shortDiscription;
	String category;
	public WishListDTO() {
		// TODO Auto-generated constructor stub
	}
	public WishListDTO(String wishId, String displayName, String shortDiscription, String category) {
		super();
		this.wishId = wishId;
		this.displayName = displayName;
		this.shortDiscription = shortDiscription;
		this.category = category;
	}
	public String getWishId() {
		return wishId;
	}
	public void setWishId(String wishId) {
		this.wishId = wishId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getShortDiscription() {
		return shortDiscription;
	}
	public void setShortDiscription(String shortDiscription) {
		this.shortDiscription = shortDiscription;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(category, displayName, shortDiscription, wishId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WishListDTO other = (WishListDTO) obj;
		return Objects.equals(category, other.category) && Objects.equals(displayName, other.displayName)
				&& Objects.equals(shortDiscription, other.shortDiscription) && Objects.equals(wishId, other.wishId);
	}
	@Override
	public String toString() {
		return "WishList [wishId=" + wishId + ", displayName=" + displayName + ", shortDiscription=" + shortDiscription
				+ ", category=" + category + "]";
	}
}
