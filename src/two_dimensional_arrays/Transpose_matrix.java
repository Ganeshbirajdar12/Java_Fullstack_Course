package two_dimensional_arrays;

import java.util.Scanner;

public class Transpose_matrix {
	
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
		
		// transpose matrix 
		int mat[][] = new int [3][3];
		
		for( int n =0; n<3; n++ )
		{
			for( int m =0; m<3; m++)
			{
				mat[n][m] = arr[m][n];
			}
		}
		
		System.out.println("After Transpose");
		for(int i=0; i<3; i++ )
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(mat[i][j] + " ");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
