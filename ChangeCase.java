package com.workingproblems;

public class ChangeCase {
	
	public static void lowerToUpper(String s) {  // 97 to 122
		char[] c = s.toCharArray();
		//char c1;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a' && c[i]<='z') {
				int  n = c[i]-32;
				c[i] = (char) n;
			}
			
		}
		System.out.println(String.valueOf(c));
	}
	
	
	public static void uppertoLower(String s) { //65 to 90
		char[] c = s.toCharArray();
		//char c1;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='A' && c[i]<='Z') {
				int  n = c[i]+32;
				c[i] = (char) n;
			}
			
		}
		System.out.println(String.valueOf(c));
	}
	

	public static void main(String[] args) {
		ChangeCase.lowerToUpper("123Riya");
		ChangeCase.uppertoLower("@EZHilan");
	}

}
