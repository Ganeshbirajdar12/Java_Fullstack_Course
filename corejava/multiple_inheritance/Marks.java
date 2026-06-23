package multiple_inheritance;

import java.util.Scanner;

public class Marks extends Register {
	int math,english,marathi;
	
	public void inputmarks() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks in math ");
		math = sc.nextInt();
		
		System.out.print("Enter marks in english ");
		english = sc.nextInt();
		
		System.out.print("Enter marks in marathi ");
		marathi = sc.nextInt();
		
		sc.close();
	}	
	public void display_marks()
	{
		System.out.println("name : "+name);
		System.out.println("Roll_no : "+roll_no);
		System.out.println("Address : "+address);
		System.out.println("marks obtained in math : "+math);
		System.out.println("marks obtained in english : "+english);
		System.out.println("marks obtained in marathi : "+marathi);
	}
		
	}


