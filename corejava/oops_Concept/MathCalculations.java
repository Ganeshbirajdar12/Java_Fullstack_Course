package oops_Concept;

import java.util.Scanner;

public class MathCalculations {

	int a,b;
	
	
	Scanner sc =  new Scanner(System.in);
	public void input()
	{
		System.out.print("Enter first Number : ");
		a =sc.nextInt();
		
		System.out.print("Enter second Number : ");
		b =sc.nextInt();
	}
	
	public int add()
	{
		return a+b;
	}
	
	public double sub()
	{
		return  a-b;
	}
	
	public int mul()
	{
		return  a*b;
	}
	
	public double div()
	{
		return a/b;
	}
	
	public void disp()
	{
		System.out.println("Addition of two numbers : " + add());
		System.out.println("substartion of two numbers : " + sub());
		System.out.println("Multipliaction of two numbers : " + mul());
		System.out.println("Division of two numbers : " + div());
	}
}
