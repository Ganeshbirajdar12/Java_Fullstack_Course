package array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove_fromArraylist {
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println("ArrayList : "+li);
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Enter Element you want to remove:");
		num = sc.nextInt();
		int index = li.indexOf(num);
		
		if(li.contains(num))
		{
			li.remove(index);
			System.out.println("Element removed Successfully");
			System.out.println("ArrayList : "+li);
			
		}
		else
		{
			System.out.println("Element not Found!");
		}
		
		
		sc.close();
	}

}
