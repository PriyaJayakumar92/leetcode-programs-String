package com.workingproblems;
//import java.util.*;

public class BinaryTree {

	public static String binaryTree(int[] a) {
		if(a.length<=1) {
			return "";
		}
		//int root_node = a[0];
		int l=0,r=0 , sumleft=0,sumright=0;
		int[] left = new int[a.length] ;
		int[] right = new int[a.length] ;
		
		if(a.length>=1) {
		System.arraycopy(a, 1, left, 0, 1);
		l++;}
		if(a.length>=2) {
		System.arraycopy(a, 2, right, 0, 1);
		r++;}
		
		for(int i=3;i<a.length;i++) {
			if(l<=r) {
				if(i+1==a.length) {
					System.arraycopy(a, i, left, l, 1);}
				else {
					System.arraycopy(a, i, left, l, 2);
				}
				l += 2;
			}
			else {
				if(i+1==a.length) {
					System.arraycopy(a, i, right, r, 1);
				}
				else {
					System.arraycopy(a, i, right, r, 2);
				}
				r+=2;
			}
			i++;
		}
		for(int i=0;i<left.length;i++) {
			if(left[i]>0) {
			sumleft += left[i];}
		}
		
		for(int i=0;i<right.length;i++) {
			if(right[i]>0) {
			sumright += right[i];}
		}
		
		if(sumleft==sumright) {
			return "";
		}
		else if(sumleft>sumright) {
			return "left";
		}
		else
			return "right";
		
	}
	
	public static void main(String[] args) {
		int[] a = {1,7};
		System.out.println(BinaryTree.binaryTree(a));
	}
}
