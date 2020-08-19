
/*public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="llhelloll";
char c = 'l';
String n="";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)!=c)	
{
n = n+s.charAt(i);	
}
}
System.out.println(n);
	}

}*/


/*public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="llhelloll";
if(s.contains("l"))
{
	System.out.println(s.replaceAll("l",""));
}

}
}*/

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="llhelloll";
//while(s.contains(Character.toString('l')))
//{
int i = s.indexOf('l');	
System.out.println(i);

//}
	
	}
}