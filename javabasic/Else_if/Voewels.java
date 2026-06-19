package Else_if;

import java.util.Scanner;

public class Voewels {

	public static void main(String[] args) {
		 
		char alphabet;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Alphabet : ");
		alphabet = sc.next().charAt(0);
		
		if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
		{
			System.out.println("alphabet is Vowel");
		}
		
		else
		{
			System.out.println("alphabet is consonant");
		}
		
		
		sc.close();
	}
}
