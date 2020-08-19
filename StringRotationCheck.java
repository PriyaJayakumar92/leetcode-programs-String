package com.workingproblems;

public class StringRotationCheck {
	public static void checkRotation(String s1, String s2) {
		int len=0;
		if (s1.length() != s2.length()) {
			System.out.println("not a string rotation");
			return;
		}

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(0) == s2.charAt(i)) {
				len = s2.length() - i;
				if (s2.regionMatches(true, i, s1, 0, len)) {

					if (s2.regionMatches(true, 0, s1, len, s1.length() - len)) {
						System.out.println(" a string rotation");
						return;
					}
				}
			}
		}
		System.out.println("not a string rotation");
		return;

	}

	public static void simpleLogic(String s1, String s2) {
		String s3 = s2 + s2;
		System.out.println(s3.contains(s1));

	}

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "tlewaterbot";
		checkRotation(s1, s2);
		simpleLogic(s1, s2);
	}
}
