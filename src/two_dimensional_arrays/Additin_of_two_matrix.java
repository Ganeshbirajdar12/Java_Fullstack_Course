package two_dimensional_arrays;

import java.util.Scanner;

public class Additin_of_two_matrix {
	
	public static void main(String[] args) {
		int arr [][] = new int [3][3];
		
		
		Scanner sc = new Scanner(System.in);

		// First Matrix
				
		for(int i=0; i<3; i++ )
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("Enter the numbers: ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++ )
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		// second matrix
		
		int arr1 [][] = new int [3][3];
		
		for(int i=0; i<3; i++ )
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("Enter the numbers: ");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++ )
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr1[i][j] + " ");
				
			}
			System.out.println();
		}
		
		// Addition Matrix
		
		 int add[][] = new int[3][3];
		for(int i=0; i<3; i++ )
		{
			for(int j=0; j<3; j++)
			{
				
				 add[i][j] =arr1[i][j]+arr1[i][j] ;
			}
		}
		
		System.out.println("After addition ");
		for(int i=0; i<3; i++ )
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(add[i][j] + " ");
				
			}
			System.out.println();
		}
		
		sc.close();
	}

}
