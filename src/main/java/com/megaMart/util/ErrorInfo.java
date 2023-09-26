package com.megaMart.util;

import java.time.LocalDate;
import java.util.Objects;

public class ErrorInfo {
	private int errorCode;
	private String errorMessage;
	private LocalDate timeStamp;
	public ErrorInfo() {
		// TODO Auto-generated constructor stub
	}
	public ErrorInfo(int errorCode, String errorMessage, LocalDate timeStamp) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.timeStamp = timeStamp;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public LocalDate getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}
	@Override
	public int hashCode() {
		return Objects.hash(errorCode, errorMessage, timeStamp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErrorInfo other = (ErrorInfo) obj;
		return errorCode == other.errorCode && Objects.equals(errorMessage, other.errorMessage)
				&& Objects.equals(timeStamp, other.timeStamp);
	}
	@Override
	public String toString() {
		return "ErrorInfo [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", timeStamp=" + timeStamp
				+ "]";
	}
	

}
