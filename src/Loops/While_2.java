package Loops;

import java.util.Scanner;

public class While_2 {
	
	public static void main(String[] args) {
		
//		boolean i = true;
//		int num;
//		
//		Scanner sc = new Scanner(System.in);
//		while(i)
//		{
//			System.out.println("Enter your number : ");
//			num = sc.nextInt();
//			if (num>0 && num<=10)
//			{
//				System.out.println("Number is valid : "+num);
//				i = false;
//			}
//			else 
//			{
//				System.out.println("Number is Invalid");
//				System.out.println("try again");
//				
//			}
//			
//		}
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		
		while(num<1 || num>10)
		{
			System.out.println("Number is Invalid");
			System.out.println("try again");
			
			System.out.println("Enter your number : ");
			num = sc.nextInt();
		}
		
		System.out.println("Your Number is Valid : "+num);
		sc.close();
	}
}
