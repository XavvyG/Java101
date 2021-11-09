package com.qa.day2;

public class UniqueSum {
	static int sum;
	public static int compute(int x, int y, int z) {
		if (x == y && x==z && y==z) {
			return 0;
		}
		if (x == y && z!=x) {
			return z;
		}
		if (y == z && x!=y) {
			return x;
		}
		if (x == z && y!=x) {
			return y;
		}
		else {
			sum = x+y+z;
		}
		return sum;
	}
}
