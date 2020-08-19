
public class BuddyStrings {

public boolean buddyStrings(String a, String b) 
{
	int count=0,j=0;
	String a1="";
	char[] c = {'\0'};
     if(a.length()==b.length())   
     {
    	 for(int i=0;i<a.length();)
    	 {
    		 
    		 if(a.charAt(i)==b.charAt(i))
    		 {
    			 i++;
    		 }
    		 else
    		 {
    			 count++;
    			 if(count<=2)
    			 {
    			 if(j==0)
    			 {
    			 j=i;
    			 i++;
    			 }
    			 else
    			 {
    				c = a.toCharArray();
    				char c1 = c[j];
    				c[j]=c[i];
    				c[i]=c1;
    				//System.out.println(c);
    				a1=String.valueOf(c);
    				//System.out.println(a1);
    				i++;
    			 }
    			 }
    			 else
    			 {
    				 System.out.println("f1");
    				 return false;
    			 }
    		 }
    	 }
    /*	 if(count==0)
    	 {
    		 for(int i=1;i<a.length();)
    		 {
    			 if(a.charAt(0)== a.charAt(i))
    			 {
    				 i++;
    			 }
    			 else
    				 return false;
    		 }
    		 return true;
    	 }
    	 else if(count>=2)
    	 {
    	 if(a1.equals(b))
    			 return true;
    	 else
    		 return false;
     }*/
    	 
    	 if(a1.equals(b))
			 return true;
	 else
	 {
		 System.out.println("f2");
		 System.out.println(c);
		 System.out.println(a1);
		 return false;
	 }
     }
     else
    	 return false;
    }



	public static void main(String[] args) {
		String a="ab";
		String b="ba";
		BuddyStrings bs=new BuddyStrings();
		System.out.println(bs.buddyStrings(a,b));

	}

}
