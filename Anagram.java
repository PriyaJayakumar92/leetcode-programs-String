import java.util.Arrays;

public class Anagram {
	
	public boolean isAnagram(String a, String b){
	    if(a.length()!=0 & b.length()!=0)
	    {
	    	if(a.length()==b.length())
	    	{
	    		a.toLowerCase();
	    		b.toLowerCase();
	    		char[] c = a.toLowerCase().toCharArray();
	    		char[] d = b.toLowerCase().toCharArray();
	    		for(int i =0;i<c.length;i++)
	    		{
	    			for(int j=0;j<d.length;j++)
	    			{
	    		if(c[i] == d[j])
	    		{
	    			c[i]=d[j]=0;
	    			break;
	    		}
	    		else if(j==b.length()-1)
	    		{
	    			return false;
	    		}
	    		}
	    			
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
		Anagram a = new Anagram();
		System.out.println(a.isAnagram("",""));

	}

}
