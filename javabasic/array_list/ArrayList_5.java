package array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_5 {
	// declaration of ArrayList
	int num;
	List<Integer> li  = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	// Switch case Method
	public void SwitchKey(int key)
	{
		
		switch(key)
		{
		
		case 1: // for add elements
			System.out.println();
			System.out.println("Enter a element: ");
			num = sc.nextInt();
			if(! li.contains(num))
			{
				li.add(num);
				System.out.println("Element Added Successfully ");
			}
			else
			{
				System.out.println("Duplicate element is not allowed");
			}
			
			break;
			
		case 2: // for remove elements
			System.out.println();
			System.out.println("Enter the element your want to delete");
			int num1 = sc.nextInt();
			if(li.contains(num1)) {
				li.remove(li.indexOf(num1));
			}
			else {
				System.out.println("Element is not present in array");
			}
			break;
		
			
		case 3: // for print ArrayList
			System.out.println();
			System.out.print("ArrayList : ");
			System.out.println(li);
			System.out.println();
			break;
		
		case 4: // for exit 
			System.out.println("------------------------ SYSTEM EXIT --------------------------------");
			System.exit(0);
			
			
			
		}
		
	}
	
	public static void main(String[] args) {  // Main Method
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList_5 a1 = new ArrayList_5(); // Object of Class
		int key;
		
		// while loop for Menu 
		while(true)
		{
			System.out.println("-----------------ArrayList Operations Menu------------------- ");
			System.out.println("1. Add Elements");
			System.out.println("2. Remove Elements");
			System.out.println("3. Print ArrayList");
			System.out.println("4. Exit ");
			key = sc.nextInt();
			
			a1.SwitchKey(key);  // Method Called
			
			
			
		}
		
	
	}
}
