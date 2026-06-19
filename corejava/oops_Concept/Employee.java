package oops_Concept;

public class Employee {

	int sal;
	String name;
	String address;
	
	public Employee(int sal, String name, String address) {
		
		this.sal = sal;
		this.name = name;
		this.address = address;
	}
	
	void disp()
	{
		System.out.println("Salary is : "+sal);
		System.out.println("Name is : "+name);
		System.out.println("address is : "+address);
	}
}
