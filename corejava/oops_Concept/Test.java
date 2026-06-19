package oops_Concept;



public class Test {

//	public static void main(String[] args) {
//		MathCalculations m1 = new MathCalculations();
//		m1.input();
//		m1.add();
//		m1.sub();
//		m1.mul();
//		m1.div();
//		m1.disp();
//	}
	
//	int abc;
//	String name;
//	int x =14;
//	Test()
//	{
//		 x = 20;
//	}
//	 void disp()
//	 {
//		 System.out.println(x);
//	 }
	
	public static void main(String[] args) {
		
//		Constructor_1 c1 = new Constructor_1();
//		System.out.println("Area of circle : "+c1.calculateAreaof_circle());
//		System.out.println("Area of rectangle : "+c1.calculateAreaof_rectangle());
//		
//		Test t = new Test();
//		System.out.println(t.abc);
//		System.out.println(t.name);
//		t.disp();
//		
//		Employee e1 = new Employee(10000,"raj","baramati");
//		e1.disp();
		
		
		Calculations c1 = new Calculations(10,20,5,6);
		System.out.println("Parameter : "+c1.paramter());
		System.out.println("Volume of cylender : "+c1.volume_of_cylender());
		
	}
	
}
