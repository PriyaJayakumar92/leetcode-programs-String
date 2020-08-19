package com.workingproblems;

public class FiboRecursive {

	static int a=0,b=1,c=0,s=0;
	public static int fiboRecursive(int n) {
		if(n==0) {
			return 1;
		}
		c=a+b;
		System.out.println(c);
		s=s+c;
		a=b;
		b=c;
		fiboRecursive(n-1);
		return s;
}
	public static void main(String[] args) {
		System.out.println(a+"\n"+b);
		System.out.println("Sum: "+fiboRecursive(5));
	}
}
