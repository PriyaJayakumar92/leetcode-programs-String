
/*public class RepeatedStringMatch {

	public static void main(String[] args) {
		String A=new String("abcde");
		String B=new String("cdeabcdeab");
		int flag=0,end=0,start=0,count=0;
		for(int i=0;i<A.length();i++)
		{
			if(A.charAt(i)==B.charAt(0))
			{
				//System.out.println(A+" and "+B);
				//System.out.println(A.length()+"and"+A.charAt(i)+" and "+i);
				//System.out.println(B.regionMatches(0, A, i, A.length()-i));
				if(B.regionMatches(0, A, i, A.length()-i))
				{
					count++;
					start=A.length()-i;
					break;
				}
			}
		
		}
		if(count==0)
		{
			System.out.println("Character mismatch in both strings");
		}
		else
		{
		
		for(int i=0;i<A.length();i++)
		{
			if(A.charAt(i)==B.charAt(B.length()-1))
			{
				if(B.regionMatches(B.length()-(i+1), A, 0, B.length()-(B.length()-(i+1))))
				{
					count++;
					end=B.length()-(i+2);
					break;
				}
			}
		
		}
		if(count==1)
		{
			System.out.println("Character mismatch in both strings");
		}
		else
		{
			//System.out.println("passed"+count);
		int i=0;
		for(;start<=end;start++)
		{
		//System.out.println(start+"and"+end);	
			if(i==A.length())
			{
				i=0;
				count++;
			}
			//System.out.println("passed"+count);
		if(B.charAt(start)!=A.charAt(i))	
		{
			
			flag=1;
			break;
		}
		i++;
		}
		if(flag==1)
			System.out.println("Character mismatch in both strings");
		else
		{
			count++;
		System.out.println("Atleast "+count+" minimum repeated times are required.");
		}
		}
		}

		
	}

}*/





class RepeatedStringMatch {
public int repeatedStringMatch(String A, String B) {
        int flag=0,end=0,start=0,count=0;
        if(A.length()==B.length()&& A.equals(B))
        {
        		count=1;
        		return count;
        }
      
        	
        
        else if(A.length()>B.length())
        {
        	for(int i=0;i<A.length();i++)
        	{
        		if(A.charAt(i)==B.charAt(0) && i!=A.length()-1)
    			{
        			
        			if(A.length()-i>=B.length() && A.regionMatches(i, B, 0, B.length()))
        			{
        				count=1;
        				break;
        				//return count;
        			}
        			
        			else if(A.length()-i<B.length()  && A.regionMatches(i, B, 0, A.length()-i))
					{
        				//System.out.println(A.regionMatches(i, B, 0, A.length()));
            			
        				if(A.regionMatches(0, B, A.length()-i, B.length()-(A.length()-i)))
        				{
        					count=2;
            				break;
        				}
					}
    			}
        		else if(A.charAt(i)==B.charAt(0) && i==A.length()-1)
        		{
        			StringBuilder s = new StringBuilder(B);
        			String t=s.reverse().toString();
        			if(A.regionMatches(A.length()-B.length(), t, 0, t.length()))
        			{
        				count=2;
        				break;
        				//return count;
        			}
        			else if(A.length()-i<B.length()  && A.regionMatches(i, B, 0, A.length()-i))
					{
        				//System.out.println(A.regionMatches(i, B, 0, A.length()));
            			
        				if(A.regionMatches(0, B, A.length()-i, B.length()-(A.length()-i)))
        				{
        					count=2;
            				break;
        				}
					}
        		}
        	}
        	if(count==1 || count==2)
        	{
        		return count;
        	}
        			else
        			{
        				System.out.println("String character mismatch");
        	        	return -1;
        			
        			}
    			}
        	
        
        
        else if(A.length()<B.length())
        {
		for(int i=0;i<A.length();i++)
		{
			if(A.charAt(i)==B.charAt(0))
			{
				//System.out.println(A+" and "+B);
				//System.out.println(A.length()+"and"+A.charAt(i)+" and "+i);
				//System.out.println(B.regionMatches(0, A, i, A.length()-i));
				if(B.regionMatches(0, A, i, A.length()-i))
				{
					count++;
					start=A.length()-i;
					break;
				}
			}
		
		}
		if(count==0)
		{
			System.out.println("Character mismatch in both strings");
            return -1;
		}
		else
		{
		if(B.length()-1!=0)
		{
		for(int i=0;i<A.length();i++)
		{
			if(A.charAt(i)==B.charAt(B.length()-1))
			{
				if(B.regionMatches(B.length()-(i+1), A, 0, B.length()-(B.length()-(i+1))))
				{
					count++;
					end=B.length()-(i+2);
					break;
				}
			}
		
		}
		if(count==1)
		{
			System.out.println("Character mismatch in both strings");
            return -1;
		}
		else
		{
			//System.out.println("passed"+count);
		int i=0;
		for(;start<=end;start++)
		{
		//System.out.println(start+"and"+end);	
			if(i==A.length())
			{
				i=0;
				count++;
			}
			//System.out.println("passed"+count);
		if(B.charAt(start)!=A.charAt(i))	
		{
			
			flag=1;
			break;
		}
		i++;
		}
		if(flag==1)
		{
			System.out.println("Character mismatch in both strings");
            return -1;
		}
		else
		{
			if(i==A.length())
				count++;
            return count;
		//System.out.println("Atleast "+count+" minimum repeated times are required.");
		}
		}
		}
		else
			return count;
		}

    }
        else
    	{
    		System.out.println("String character mismatch");
    	return -1;
    	}
        	
}
    public static void main(String[] args) {
		String A=new String("ba");
		
		String B=new String("ab");
		RepeatedStringMatch r = new RepeatedStringMatch();
        int m=r.repeatedStringMatch(A,B);
        if(m!=-1)
        System.out.println("Atleast "+m+" minimum repeated times are required.");
        
    }
}

