package com.qa.day2;

public class BlackJack {

	static int x;
	static int y;

	public static int drawCards() {
		if ((x <= 21 && y <= 21 && x > y) || (x <= 21 && y > 21 && x > y)) {
			return x;
		}
		else if ((x <= 21 && y <= 21 && x < y)||(x > 21 && y <= 21 && x < y)) {
			return y;
		}
		else if (x == 21 && y == 21) {
			return 21;
		}
		else {
			return 0;
		}
	}
}
