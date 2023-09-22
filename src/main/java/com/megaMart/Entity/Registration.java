package com.megaMart.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Registration {
	
	@Id
	private String emailId;
	private String name;
	private String password;
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(emailId, name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		return Objects.equals(emailId, other.emailId) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "Registration [emailId=" + emailId + ", name=" + name + ", password=" + password + "]";
	}
	

}
