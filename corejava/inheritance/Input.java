package inheritance;

import java.util.Scanner;

public class Input  {
	int l,w,r,side;
	Scanner sc =  new Scanner(System.in);
	 void getData(){
		System.out.println("Enter the length of Triangle ");
		this.l = sc.nextInt();
	
		System.out.println("Enter the width of Triangle");
		this.w = sc.nextInt();
		
		System.out.println("Enter the radius of Circle");
		this.r = sc.nextInt();
		
		System.out.println("Enter the side of Square");
		this.side = sc.nextInt();
	}
	

}
