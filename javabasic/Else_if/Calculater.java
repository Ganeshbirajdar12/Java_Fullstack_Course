package Else_if;

import java.util.Scanner;

public class Calculater {
	
	public static void main(String[] args) {
		
		double num1,num2;
		char choice;
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Num1");
		num1 = sc.nextDouble();
		
		System.out.println("Enter Num2");
		num2 = sc.nextDouble();
		
		System.out.println("Enter Your choice: ");
		choice = sc.next().charAt(0);
		
		if(choice == '+')
		{
			System.out.println("Choice is Addition:");
			System.out.println("Result = " + (num1+num2));
			
		}
		
		else if(choice == '-')
		{
			System.out.println("Choice is Substration:");
			System.out.println("Result = " + (num1-num2));
			
		}
		
		else if(choice == '*')
		{
			System.out.println("Choice is Multiplication:");
			System.out.println("Result = " + (num1*num2));
			
		}
		
		
		else if(choice == '/')
		{
			System.out.println("Choice is Division:");
			System.out.println("Result = " + (num1/num2));
			
		}
		sc.close();
		
	}

}
