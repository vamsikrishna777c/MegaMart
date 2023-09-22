package com.megaMart.DTO;

import java.util.Objects;

public class RegistrationDTO {
	private String emailId;
	private String name;
	private String password;
	public RegistrationDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public RegistrationDTO(String emailId, String name, String password) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.password = password;
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
		RegistrationDTO other = (RegistrationDTO) obj;
		return Objects.equals(emailId, other.emailId) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "RegistrationDTO [emailId=" + emailId + ", name=" + name + ", password=" + password + "]";
	}
	

}
