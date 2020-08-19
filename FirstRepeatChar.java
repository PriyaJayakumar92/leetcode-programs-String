import java.util.*;
//import java.util.Map.Entry; 

class RepeatChar{
	
	public void findFirstRepeatChar(Map<Integer,String> m) {
		
		String s = null;
		for(Map.Entry<Integer,String> m1 : m.entrySet())
		{
			s = m1.getValue();
			find(s);
			
		}
	}
	
	public void find(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j))
				{
					System.out.println("First Repeated Char in string "+s+" is char '"+s.charAt(i)+"'");
					return;
				} 
			}
		}
		System.out.println("There is no repeated char is the string "+s);
		return;
	}
}



public class FirstRepeatChar {

	public static void main(String[] args) {
		
RepeatChar r = new RepeatChar();

Map<Integer,String> m = new HashMap<Integer,String>();
m.put(1,"apple");
m.put(2,"orraange");
m.put(3, "grapes");
for(Map.Entry<Integer,String> m1 : m.entrySet())
	System.out.println(m1.getKey()+"  "+m1.getValue());

r.findFirstRepeatChar(m);

	}

}
