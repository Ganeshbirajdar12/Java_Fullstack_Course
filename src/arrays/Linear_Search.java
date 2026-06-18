package arrays;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		int arr[] = {150,205,84,36,134,453 };
		int num;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the number you want to search:");
		num = sc.nextInt();
		
		for(int i = 0; i<arr.length; i++ )
		{
			if(arr[i] == num)
			{
				System.out.println("Number found in array at "+i + " index");
				flag = true;
			}
			
		}
		
		if(!flag)
		{
			System.out.println("Number is not found in array ");
		}
		
		
		sc.close();
	}
}
