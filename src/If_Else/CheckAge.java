package If_Else;

import java.util.Scanner;

public class CheckAge {
	
	public static void main(String[] args) {
		
		int age ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		age = sc.nextInt();
		
		if(age>18)
		{
			System.out.println("you can drive");
		}
		
		else 
		{
			System.out.println("you can't drive");
		}
		
		sc.close();
	}

}
