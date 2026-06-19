package arrays;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		
		int marks[] = new int[7];
		int total=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter your marks: ");
			marks[i] = sc.nextInt();
		}
		
		
		System.out.print("Marks : ");
		for(int i=0; i<marks.length; i++)
		{
			
			System.out.print(marks[i]+ " ");
		}
		
		for(int i=0; i<marks.length; i++)
		{
			
			total = total +marks[i];
		}
		 System.out.println();
		System.out.println("Total marks obtained by Student : "+total);
		
		System.out.println("Average marks obtained by Student : "+(total/marks.length));
		
		sc.close();
		
	}
}
