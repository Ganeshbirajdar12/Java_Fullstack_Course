package array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayList_2 {
	public static void main(String[] args) {
		
		List <Integer> l1 = new ArrayList<>();
		int num;
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<4; i++)
		{
			System.out.print("Enter any number : ");
			num = sc.nextInt();
			l1.add(num);
			
		}
		
		System.out.print("ArrayList : ");
//		for(int num1:l1)
//		{
//			System.out.print(num1 + " ");
//		}
//		sc.close();
		
		Iterator<Integer> itr  =l1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		
		sc.close();
	}

}
