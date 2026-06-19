package Switch_Case;

import java.util.Scanner;

public class Even_odd {
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Number");
		num = sc.nextInt();
		
		
		switch(num%2)
		{
		
		case 0 :
			
			System.out.println("Number is Even");
			break;
			
		case 1 :
			
			System.out.println("Number is Odd");
			break;
			
		default:
			System.out.println("Invalid Input");
		}
		
		sc.close();
			
	}

}
