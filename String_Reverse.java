package com.workingproblems;


public class String_Reverse {
	public String reverseString(String str) {
		
		//Base condition
		if(str == null || str.isBlank()) {
			System.out.println("Null or empty");
			return null;
		}
		
		char[] c1 = str.toCharArray();
		char c;
		

		for (int i = 0, j = c1.length - 1; i < j; i++, j--) {
			c = c1[i];
			c1[i] = c1[j];
			c1[j] = c;
		}
		return String.valueOf(c1);
	}

	public static void main(String[] args) {
		String_Reverse s = new String_Reverse();
		System.out.println(s.reverseString(""));
	}
}
