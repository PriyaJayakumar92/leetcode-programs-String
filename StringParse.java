package com.workingproblems;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StringParse {

	public static String parseStmt(String s, List<String> list) {
		StringBuilder sb = new StringBuilder();
		String[] s_array = s.split(" ");
		
		for(int i=0;i<s_array.length;i++) {
			if(!list.contains(s_array[i])) {
				sb.append(s_array[i]).append(" ");
			}
		}
		return sb.toString().trim();
	}
	
	public static String parseStmt1(String s, List<String> list) {
		StringBuilder sb1 = new StringBuilder();
		String[] s_array = s.split(" ");
		
		List<String> list1 = new ArrayList<String>(Arrays.asList(s_array));
		list1.removeAll(list);
		for(String str:list1) {
			sb1.append(str).append(" ");
		}
		return sb1.toString().trim();
	}

	public static void main(String[] args) {
		String s = "Hai I am good";
		List<String> list = Arrays.asList("Hai", "am");
		System.out.println(StringParse.parseStmt(s, list));
		System.out.println(StringParse.parseStmt1(s, list));
	}
}
