package priya.innerclass;

public class SwapWithoutTemp {  
    public static void main(String args[]) {  
        String a = "Love";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        System.out.println(b);
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }  
}  
