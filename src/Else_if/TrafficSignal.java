package Else_if;

import java.util.Scanner;

public class TrafficSignal {

		public static void main(String[] args) {
			 
			char choice;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter you choice : ");
			choice = sc.next().charAt(0);
			
			if(choice == 'r')
			{
				System.out.println("Stop!!!");
			}
			
			else if (choice == 'y')
			{
				System.out.println("Get ready");
			}
			
			else if (choice == 'g')
			{
				System.out.println("Gooo!!");
			}
			
			else {
				System.out.println("Invalid Input");
			}
			
			sc.close();
		}
}
