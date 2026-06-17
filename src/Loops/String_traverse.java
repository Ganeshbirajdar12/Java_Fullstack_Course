package Loops;

import java.util.Scanner;

public class String_traverse {
	
	public static void main(String[] args) {
		
		char ch;
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : ");
		str1 = sc.nextLine();
		
		for(int i=0; i<str1.length();i++)
		{
			ch = str1.charAt(i);
			System.out.print(ch+ " ");
		}
		sc.close();
	}

}
