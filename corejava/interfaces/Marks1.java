package interfaces;

import java.util.Scanner;

public class Marks1 implements Marks {
	int math,english,marathi;
	
	@Override
	public void inputmarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks in math ");
		math = sc.nextInt();
		
		System.out.println("Enter marks in english ");
		english = sc.nextInt();
		
		System.out.println("Enter marks in marathi ");
		marathi = sc.nextInt();
		
		sc.close();
		
	}
	
	void disp()
	{
		System.out.println("marks obtained in math : "+math);
		System.out.println("marks obtained in english : "+english);
		System.out.println("marks obtained in marathi : "+marathi);
	}

	
}
