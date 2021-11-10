package com.qa.day2;

public class Taxes {
	static int salary;

	public static int taxPercentage() {
		if (salary < 15000) {
			return 0;
		}
		else if (salary >= 15000 && salary < 20000) {
			return 10;
		}
		else if (salary >= 20000 && salary < 30000) {
			return 15;
		}
		else if (salary >= 30000 && salary < 45000) {
			return 20;
		} else {
			return 25;
		}
	}

	public static double taxAmount() {
		double taxValue = taxPercentage() * salary / 100;
		return taxValue;
	}
}