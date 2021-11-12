package com.qa.day5.encapsulation;

public class ReadWrite {
	
	// - Encapsulation -> Restriction direct access to variables within a class
	// - - Access Modifiers: public, private (only seen within the class), protected, default
	
	
	public String name;
	
	private long digits;
	private int cvc;
	private String expiryDate;
	
	// getters (read values) & setters (update/write to variables)
	
	// shortcut to generate getters & setters:
	// right-click on the class -> Source -> -> generate getters & setters

	public long getDigits() {
		return digits;
	}
	public void setDigits(long digits) {
		this.digits = digits;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
}
