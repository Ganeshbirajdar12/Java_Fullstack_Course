package oops_Concept;

public class Inheritance_1 {
	public void display()
	{
		System.out.println("I am Super Class");
	}
	

}

class Sub extends Inheritance_1
{
	public static void main(String[] args) {
		Sub s  = new Sub();
		s.display();
	}
}
