package com.qa.day2;

public class Results {

	static int physics;
	static int chemistry;
	static int biology;

	public static double method1() {
		int total = physics + chemistry + biology;
		System.out.println("Physics: " + physics + "\nChemistry: " + chemistry + "\nBiology: " + biology);
		System.out.println("Total mark: " + total);
		return total;
	}

	public static String method2() {
		double percentage = (method1() / 450) * 100;
		String percentage2DP = String.format("%.2f", percentage);
		if (percentage >= 60 && physics >= 90 && chemistry >= 90 && biology >= 90) {
			return "Pass: " +percentage2DP+ "%";	
		}
		
		else {			
			if (physics < 90){
			System.out.println("Fail (Physics)"); 
		}
			if (chemistry < 90){
			System.out.println("Fail (Chemistry)"); 
		}
			if (biology < 90){
			System.out.println("Fail (Biology)"); 
		}
			return "Overall Fail";
		}
	}
}