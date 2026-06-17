package nested_If_else;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		String uname = "user";
		int pass = 1234;
		
		String uname1;
		int pass1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username :");
		uname1 = sc.nextLine();
		
		System.out.println("Enter Password :");
		pass1 = sc.nextInt();
		
		if(uname1.equals(uname))
		{
			
			if(pass1 == pass)
			{
				System.out.println("Login Successful!");
				
			}
			else
			{
				System.out.println("Password is Incorrect.");
			}
		}
		
		else {
			System.out.println("Username is incorrect.");
		}
		
		sc.close();
	}

}
