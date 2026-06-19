package arrays;

import java.util.Scanner;

public class Array_1 {
	
	public static void main(String[] args) 
	{
		int arr[] = new int [5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter your numbers: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		sc.close();
	}
}
