package com.workingproblems;
//import java.util.*;

public class BinaryToDecimal {

	public static void binaryToDecimal(String s) {
		int value = 0;
		int sum = 0;
		for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {

			value = Character.getNumericValue(s.charAt(i));

			sum = sum + (int) (value * Math.pow(2, j));

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		BinaryToDecimal.binaryToDecimal("10010");
	}
}
