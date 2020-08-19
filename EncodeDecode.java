package priya.innerclass;

import java.lang.String;
import java.lang.StringBuilder;

public class EncodeDecode {

	public String decode(String s) {

		// char[] encode = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			
			if (Character.isDigit(s.charAt(i))) {
				System.out.println(s.charAt(i));
				
				char c = s.charAt(i);
				//int count = Integer.parseInt(String.valueOf(c));
				
				int count = Integer.valueOf(String.valueOf(c));
				
				//int count = Character.getNumericValue(s.charAt(i));
				
				System.out.println("count "+ count);
				// to get the repeated chars
				for (int j = 1; j <= count; j++) {
					s1 = s1 + (s.charAt(i - 1));
					//System.out.println(s1);
				}

				sb.append(s1);
				//System.out.println(sb);
				s1 = "";
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {

		EncodeDecode e = new EncodeDecode();

		String encoded = "A2B7C3Z2";

		System.out.println("Decoded String is " + e.decode(encoded));// This should print AABBBBBBBCCCZZ

	}

}
