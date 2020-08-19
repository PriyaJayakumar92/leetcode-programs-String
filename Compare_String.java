package com.workingproblems;

public class Compare_String {
	public boolean compareStr(String s1,String s2)
	{
		//base condition
		if(s1.length()!=s2.length())
		{
			return false;
		}
		//main logic
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return false;
			}
				
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Compare_String c = new Compare_String();
		System.out.println(c.compareStr("apple","apple"));
	}
}
