package java_basic;

import java.util.Scanner;

public class First {
	public static void main(String args [])
    {
        System.out.println("Hello I am Using Java");
        int a,b,add,sub,mul;
        
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        
        System.out.println("Enter the value of b");
        b = sc.nextInt();
         
      
        add = a+b;
        System.out.println("Addition of Three Numbers : "+add);
        
        sub = a-b;
        System.out.println("substration of Three Numbers : "+sub);
        
        mul = a*b;
        System.out.println("Addition of Three Numbers : "+mul);
        
        sc.close();
      

}
}
