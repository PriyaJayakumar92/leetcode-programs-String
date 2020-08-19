
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "pup";
		if(p.length()>1)
		{
		char[] c = p.toCharArray();
		int n=c.length-1;
		for(int i=0;i<n;)
		{
			if(c[i]==(c[n]))
			{
				n--;
				i++;
				if(i==n)
					System.out.println(" it is a palindrome");
			}
			
			else
			{
				System.out.println("not a palindrome");
				break;
			}
			
		}
		
		
		}

	}

}
