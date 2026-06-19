package arrays;

import java.util.Scanner;

public class Search_in_Array {

	public static void main(String[] args) {
		
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter your numbers: ");
			arr[i] = sc.nextInt();
		}
			
		for(int i=0; i<arr.length; i++)
		{
			
			System.out.print(arr[i]+ " ");
		}
		int num;
		int count = 0;
		System.out.println();
		System.out.println("Enter the number you want to search:");
		num = sc.nextInt();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == num)
			{
				count+=1;
			}
			
		}
		
		System.out.println("the occurance of number is "+count);
		
		sc.close();
	}
}
