package oops_Concept;

import java.util.Scanner;

public class Triangle {
	
	int l,w ;

	Scanner sc = new Scanner(System.in);
	public Triangle() {
		System.out.println("Enter the length of Triangle ");
		l = sc.nextInt();
		
		System.out.println("Enter the width of Triangle");
		w = sc.nextInt();
		
	}
	
	public void areaOfTriangle()
	{
		System.out.println("area Of Triangle : "+(l*w));
	}
	

}

class Calculate extends Triangle
{
	public static void main(String[] args) {
		
		Calculate cal = new Calculate();
		cal.areaOfTriangle();
	}
	
}


