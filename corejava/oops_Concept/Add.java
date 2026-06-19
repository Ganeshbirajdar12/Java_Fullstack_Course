package oops_Concept;

import java.util.Scanner;

public class Add {
	
	int a,b;
	int sum1;
	Scanner sc =  new Scanner(System.in);
	public void input()
	{
		System.out.print("Enter first Number : ");
		a =sc.nextInt();
		
		System.out.print("Enter second Number : ");
		b =sc.nextInt();
	}
	
	public void sum() {
		 sum1 = a + b;

	}
	
	public void disp()
	{
		System.out.println("Result is : "+sum1);
	}

}
