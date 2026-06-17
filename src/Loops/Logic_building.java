package Loops;

import java.util.Scanner;

public class Logic_building {
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Number");
		num = sc.nextInt();
		
		for(int i = 1;i<=num/2;i++)
		{
			if (num%i == 0)
			{
				System.out.println("multiple of given number : "+i);
			}
		}
		
		sc.close();
		
	}
	
	

}
