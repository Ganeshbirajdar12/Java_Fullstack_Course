package If_Else;

import java.util.Scanner;

// WAP to check number is Negative or Positive
public class Checknumber {
	
	public static void main(String[] args) {
		
		int num ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		
		else 
		{
			System.out.println("Number is Negative");
		}
		
		sc.close();
	}

}
