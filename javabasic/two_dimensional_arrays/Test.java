package two_dimensional_arrays;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		int arr [][] = new int [3][3];
		Scanner sc = new Scanner(System.in);
//		int row ;
//		int col ;
		
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
		
		sc.close();
		
		
	}

}
