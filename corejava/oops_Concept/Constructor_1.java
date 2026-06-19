package oops_Concept;

import java.util.Scanner;

public class Constructor_1 {
	
	int r,l,b;
	final double PI = 3.14;
	Scanner sc = new Scanner(System.in);
	Constructor_1()
	{
		System.out.print("Enter the value of area : ");
		r = sc.nextInt();
		System.out.print(" Enter the length :");
		l = sc.nextInt();
		System.out.println("Enter the width:");
		b = sc.nextInt();
		
	}
	
	public double calculateAreaof_circle()
	{
		return PI*r*r;
	}
	 
	public int calculateAreaof_rectangle()
	{
		return l*b;
	}
	 

}
