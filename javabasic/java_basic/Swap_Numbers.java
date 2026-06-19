package java_basic;

import java.util.Scanner;

public class Swap_Numbers {
	
	public static void main(String[] args) {
		
		int num1 ,num2 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of Num1 : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the value of Num2 : ");
		num2 = sc.nextInt();
		
		System.out.println("Numbers Before Swap: " + num1+ " "+ num2);
		
		
//		method 1
		
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
//	
//		Method 2
//		num1 = num1 + num2;
//		num2 = num1 - num2;
//		num1 = num1 - num2;
		
// 		Method 3
		num1 = num1^num2;
		num2 = num1^num2;
		num1 = num1^num2;
		
		System.out.println("Numbers After Swap: " + num1 +" "+ num2);
		
		sc.close();
		
		
	}

}
