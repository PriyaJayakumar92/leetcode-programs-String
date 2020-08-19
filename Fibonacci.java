package com.workingproblems;

public class Fibonacci {
	public static void fibo(int a, int b) {
		int c=0;
		System.out.println(a+"\n"+b);
		for(int i=0;i<5;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	
	public static void fiboSum(int a, int b) {
		int c=0,s=0;
		System.out.println(a+"\n"+b);
		for(int i=0;i<5;i++) {
			c=a+b;
			s=s+c;
			System.out.println(c);
			a=b;
			b=c;
	}
		System.out.println("Sum: "+s);
	}
	
	
	public static void main(String[] args) {
		fibo(0,1);
		fiboSum(0,1);
	}
}
