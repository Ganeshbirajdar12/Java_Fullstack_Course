package multiple_inheritance;

import java.util.Scanner;

public class Register   {
	
	String name;
	int roll_no;
	String address;
	Scanner sc = new Scanner(System.in);
	
	void input()
	{
		System.out.print("Enter the name : " );
		 name = sc.nextLine();
		
		System.out.print("Enter roll_no : ");
		roll_no = sc.nextInt();
		
		System.out.print("Enter your address : ");
		address = sc.next();
		
	}
	
	
}
