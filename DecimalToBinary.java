package com.workingproblems;

public class DecimalToBinary {

	public static void decimalToBinary(int decimal) {
		int[] binary = new int[20];
		int index=0;
		while(decimal>0) {
			binary[index++] = decimal%2;
			decimal /= 2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
	}
	
	public static void main(String[] args) {
		DecimalToBinary.decimalToBinary(40);
		System.out.println();
		System.out.print(Integer.toBinaryString(30));
	}
}
