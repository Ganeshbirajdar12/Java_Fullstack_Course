package Loops;

import java.util.Scanner;

public class Break_stmt {
	
	public static void main(String[] args) {
	       
	       int num;
	       int sum = 0;
	       Scanner sc = new Scanner(System.in);
	       for(int i = 1; i<=10; i++)
	       {
	          
	           System.out.println("Enter any number: ");
	           num = sc.nextInt();
	           
	           if (num>=1 && num<=10)
	           {
	        	   		sum =sum+num;
	           }
	           else 
	           {
	        	   	   System.out.println("Number is out of range ");
	               break;
	           }
	        
	       }
	     
	        System.out.println("Total Sum : " +sum);
	        System.out.println("OK BYE");
	        sc.close();
	        
	    }

}
