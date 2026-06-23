package abstraction;

abstract class Employee1
{
	String name = "Rajesh";
	double salary = 15000.0;
	
	abstract void update(double salary);
	
	void disp()
	{
		System.out.println("Name of Employee : "+name);
		System.out.println("Salary : "+salary);
	}
	
}

public class Test extends Employee1 {
	
	void update(double salary)
	{
		this.salary = salary;
		
	}
	
	public static void main(String[] args) {
		
		Employee1 e1 = new Test();
		e1.update(10000.0);
		e1.disp();
	}
	
}

