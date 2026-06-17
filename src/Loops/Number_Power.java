package Loops;

import java.util.Scanner;

public class Number_Power {

	public static void main(String[] args) 
	{
		
		int num,power;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		num = sc.nextInt();
		
		System.out.println("Enter any power: ");
		power = sc.nextInt();
		int result=1;
		
		for (int i =1; i<=power; i++)
		{
			result = result*num;
			
		}
		
		System.out.println("Power of give number is : "+result);
		sc.close();
	
	}
}
