package com.leetcode.string;

class ShuffleStringLogic {
	
	    public String restoreString(String s, int[] indices) {
	        char[] c = s.toCharArray();
	        char[] c1 = new char[c.length];
	        int count=0;
	        
	        if(s.length()!=indices.length){
	            return null;
	        }
	        
	        for(int i=0;i<indices.length && indices[i]<c1.length;i++){
	            c1[indices[i]] = c[i];
	            count++;
	        }
	        if(count==indices.length){
	            return String.valueOf(c1);
	        }
	        return null;
	    }
	}

public class ShuffleString{
	public static void main(String[] args) {
		ShuffleStringLogic s = new ShuffleStringLogic();
		System.out.println(s.restoreString("priya",new int[]{4,2,0,1,3}));
	}
}

