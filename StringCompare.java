


/*public class StringCompare {
	
	public boolean isEqual(String a, String b){
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		
		if(c.length!= 0 & d.length!=0)
		{
	     if(c.length==d.length)
	      {
		    for(int i=0;i<c.length;)
		    {
		    	if(c[i]==d[i])
		    	{
		    		i++;
		    	}
		    	else
		    		return false;
		    }
		    return true;
	      }
	   else
		   return false;
	    }
		else
			return false;
	}

	public static void main(String[] args) {
		
StringCompare s = new StringCompare();
System.out.println(s.isEqual("trEe","tree"));
		
	}

}*/

public class StringCompare {
	
	public boolean isEqual(String a, String b){
		
		
		if(a.length()!= 0 & b.length()!=0)
		{
	    	 if(a==b)
	    	 {
		    return true;
	    	 }
	    	 else
	    		 return false;
	      
		}
    	 else
			return false;
	}
	

	public static void main(String[] args) {
		
StringCompare s = new StringCompare();
System.out.println(s.isEqual("trEe","tree"));
		
	}

}
