package Switch_Case;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		char choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you choice : ");
		choice = sc.next().charAt(0);
		
		switch(choice)
		{
		case 'r':
			System.out.println("Stop!!!");
			break;
			
		case 'y':
			System.out.println("Get ready!");
			break;
		
		case 'g':
			System.out.println("G0ooo!");
			break;
			
		default:
			System.out.println("Invalid choice");
			
		}
		
		sc.close();
	}
}
