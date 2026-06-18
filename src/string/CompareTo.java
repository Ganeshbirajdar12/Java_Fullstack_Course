package string;

import java.util.Scanner;

public class CompareTo {

	public static void main(String[] args) {
		
		 Scanner sc  = new Scanner(System.in);
		 String str1;
		 String str2;
		 
		 System.out.println("Enter the String: ");
		 str1 = sc.nextLine();
		 
		 System.out.println("Enter the String: ");
		 str2 = sc.nextLine();
		 
		  int value  = str1.compareTo(str2);
		  
		  if(value>0)
		  {
			  System.out.println("Str1 is greter than Str2");
		  }
		  else if (value == 0)
		  {
			  System.out.println("Both Strings are Equal");
		  }
		  else 
		  {
			  System.out.println(" Str2 is greter than Str1");
		  }
		                                                                          
		  sc.close();
	}

}
