package java_basic;

public class Number {
	
	public static void main(String[] args) {
        
	        int number = 1234;
	        
	        int a = number%10;
	        System.out.println( "a : "+a);
	        
	        int b = (number/10)%10;
	        System.out.println( "b : "+b);
	        
	        int c=(number/100)%10;
	        System.out.println( "c : "+c);
	         
	        int d=(number/1000)%10;
	        System.out.println( "d : "+d);
    }

}
