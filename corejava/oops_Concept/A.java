package oops_Concept;

import java.util.Scanner;

public class A {  // for Inputs
	
	int l,w,r,h;
	Scanner sc =  new Scanner(System.in);
	A(){
		System.out.println("Enter the length of Triangle ");
		l = sc.nextInt();
	
		System.out.println("Enter the width of Triangle");
		w = sc.nextInt();
		
		System.out.println("Enter the radius of Circle");
		r = sc.nextInt();
		
		System.out.println("Enter the height of cylender");
		h = sc.nextInt();
	}
	
	

}

class B extends A  // for  Calculations
{
	public double areaOfTriangle()
	{
		return (2*(l+w));
	}
	
	public double volumeOfcylender()
	{
		
		return 3.14*r*r*h;
	}
}

class C extends B
{
	public static void main(String[] args) {
		 C disp = new C();
		 System.out.println("area Of Triangle : "+disp.areaOfTriangle());
		 System.out.println("volume Of cylender : "+disp.volumeOfcylender());
		 
	}
	
}

