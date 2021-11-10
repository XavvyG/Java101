package com.qa.day3;

public class Numbers {

//	Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
//	Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
//	Expand on the method you wrote in Numbers 2 to allow the input 1-999.
//	Expand the method you wrote in Numbers 2 to allow the input 1-9999

//-------------------------------------------------------------------------------------------------

	// ------------------------------------------------------------------------
	// 1. Create a method that takes a number 10-99, and adds the two digits
	// together for example 74 = 7 + 4 = 11.
	// without string
	public int sumDig(int n) {
		int val = 0;
		while (n >= 10 && n <= 99) {// 11
			n = n - 10;// 1
			val++;// 1
		}
		while (n >= 1 && n <= 9) {
			n = n - 1;// 0
			val++;// 1+1
		}
		return val;// 2
	}

	// string method
	public int sumDigits(int n) {
		String strNum = Integer.toString(n);
		int sum = 0;

		if (n < 10 || n > 99) {
			return 0;
		}

		for (int i = 0; i < strNum.length(); i++) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		return sum;
	}

	// array version of numbers-to-words
	public String arrayNum2Word(int number) {
		String[] units = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty" };
		String out = "";

		if (number <= 20) {
			out += units[number - 1];
		}
		return out;
	}

	// ------------------------------------------------------------------------
	// 2. Create a second method that when given the number 1-99 returns a String
	// representation of this number, for example 1 = one, 11 = eleven, 21 =
	// twenty-one.
	public String task2(int num) {

		int tens = 0;
		int ones = 0;
		String retstring = "";

		while (num >= 10) {
			num -= 10;// 10
			tens++;// 1,2
		}
		while (num >= 1) {
			num -= 1;
			ones++;// 1
		}
		String special = special(tens, ones);
		if (special == "") {
			retstring += tens(tens) + " " + units(ones);
		} else {
			retstring += special;
		}
		return retstring;
	}

	// store numbers as strings
	public String units(int num) {
		String retval = "";
		switch (num) {
		case 1:
			retval += "one";
			break;
		case 2:
			retval += "two";
			break;
		case 3:
			retval += "three";
			break;
		case 4:
			retval += "four";
			break;
		case 5:
			retval += "five";
			break;
		case 6:
			retval += "six";
			break;
		case 7:
			retval += "seven";
			break;
		case 8:
			retval += "eight";
			break;
		case 9:
			retval += "nine";
			break;
		}
		return retval;
	}

	public String tens(int num) {
		String retval = "";
		switch (num) {
		case 2:
			retval += "twenty";
			break;
		case 3:
			retval += "thirty";
			break;
		case 4:
			retval += "fourty";
			break;
		case 5:
			retval += "fifty";
			break;
		case 6:
			retval += "sixty";
			break;
		case 7:
			retval += "seventy";
			break;
		case 8:
			retval += "eighty";
			break;
		case 9:
			retval += "ninety";
			break;
		}
		return retval;
	}

	public String special(int tens, int ones) {
		String retval = "";
		int num = tens * 10 + ones;
		switch (num) {
		case 10:
			retval += "ten";
			break;
		case 11:
			retval += "eleven";
			break;
		case 12:
			retval += "twelve";
			break;
		case 13:
			retval += "thirteen";
			break;
		case 14:
			retval += "fourteen";
			break;
		case 15:
			retval += "fifteen";
			break;
		case 16:
			retval += "sixteen";
			break;
		case 17:
			retval += "seventeen";
			break;
		case 18:
			retval += "eighteen";
			break;
		case 19:
			retval += "nineteen";
			break;
		}
		return retval;
	}

	// ------------------------------------------------------------------------
	// 3. Expand on the method you wrote in Numbers 2 to allow the input 1-999.
	public String task3(int num) {
		int hundreds = 0;
		int tens = 0;
		int ones = 0;
		String retstring = "";
		while (num >= 100) {
			num -= 100;
			hundreds++;
		}
		while (num >= 10) {
			num -= 10;
			tens++;
		}
		while (num >= 1) {
			num -= 1;
			ones++;
		}

		String hundredstring = units(hundreds);

		if (hundredstring != "") {
			hundredstring += " hundred ";
			retstring += hundredstring;
		}
		String special = special(tens, ones);
		if (special == "") {
			retstring += tens(tens) + " " + units(ones);
		} else {
			retstring += special;
		}

		return retstring;
	}

	// ------------------------------------------------------------------------
	// 4. Expand the method you wrote in Numbers 2 to allow the input 1-9999
	public String task4(int num) {
		int thousands = 0;
		int hundreds = 0;
		int tens = 0;
		int ones = 0;
		String retstring = "";
		while (num >= 1000) {
			num -= 1000;
			thousands++;
		}
		while (num >= 100) {
			num -= 100;
			hundreds++;
		}
		while (num >= 10) {
			num -= 10;
			tens++;
		}
		while (num >= 1) {
			num -= 1;
			ones++;
		}

		String thousandstring = units(thousands);

		if (thousandstring != "") {
			thousandstring += " thousand ";
			retstring += thousandstring;
		}

		String hundredstring = units(hundreds);

		if (hundredstring != "") {
			hundredstring += " hundred and ";
			retstring += hundredstring;
		}
		String special = special(tens, ones);
		if (special == "") {
			retstring += tens(tens) + " " + units(ones);
		} else {
			retstring += special;
		}
		return retstring;
	}

	// ------------------------------------------------------------------------EXTRA
	// ------- ARRAY VERSION -------
	public String arrayVs(int number) {
		String[] units = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty" };
		String[] tensArray = { "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String out = "";

		int num = 0;
		num += number; // still nice to have a local save
		int thousands = num / 1000;
		num -= thousands * 1000;
		int hundreds = num / 100;
		num -= hundreds * 100;
		int tens = num / 10;
		num -= tens * 10;
		int ones = num;

		int nonameidea = tens * 10 + ones;

		if (thousands > 0) {
			// this is for 1000-9999
			out += units[thousands - 1];
			out += " thousand ";
		}

		if (hundreds > 0) {
			// this is for 1000-9999
			out += units[hundreds - 1];
			out += " hundred ";
		}
		if (number > 100) {
			out += "and ";
		}
		if (nonameidea <= 20) {
			out += units[nonameidea - 1];
		} else {
			if (tens > 0) {
				// here we guarantee a 21+ number
				out += tensArray[tens - 3];
			}
			if (ones > 0) {
				out += " " + units[ones - 1];
			}
		}
		return out;
	}
}