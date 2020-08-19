
public class RepeatedChar {
	
	public void findRepeatChar(String s1)
	{
	    String s = s1.toLowerCase();	
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
			if(s.charAt(i)==s.charAt(j))
			{
				System.out.println(s.charAt(i));
				break;
			}
			}
		}
	}

	public static void main(String[] args) {
		RepeatedChar r = new RepeatedChar();
		r.findRepeatChar("evaluate");
		
		
	}

}
