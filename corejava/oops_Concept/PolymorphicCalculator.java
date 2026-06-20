package oops_Concept;

public class PolymorphicCalculator {
	
	public int add(int a,int b)
	{
		System.out.println("Additng 2 Integers");
		return a+b;
	}

	public double add(double a,double b)
	{
		System.out.println("Additng 2 double");
		return a+b;
	}
	
	public static void main(String[] args) {
		PolymorphicCalculator cal = new PolymorphicCalculator();
		System.out.println(cal.add(10,20));
		System.out.println(cal.add(10.0,20.0));
	}

}
