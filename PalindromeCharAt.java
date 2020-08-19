
public class PalindromeCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String si = "maDAm";
String s=si.toLowerCase();
System.out.println(s);
int n=s.length()-1;
for(int i=0;i<n;) {
if(s.charAt(0)==s.charAt(n))
{
	n--;
i++;
System.out.println("matching");
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
