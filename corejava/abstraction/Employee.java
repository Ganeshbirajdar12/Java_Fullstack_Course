package abstraction;

public class Employee {

	int emp_id; 
	String name;
	String job_role ;
	String address;
	
	static String company_name = "Infosys";
	
	public Employee(int emp_id, String job_role, String address,String name) {
		super();
		this.emp_id = emp_id;
		this.job_role = job_role;
		this.address = address;
		this.name = name;
	}
	void disp()
	{
		System.out.println("emp_id : "+emp_id+" Emp_name :"+name+" job_role: "+job_role+ " address: "+address+ " company: "+company_name);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"software dev","Pune","Shyam");
		e1.disp();
		
		Employee e2 = new Employee(103,"AI engineer","Baramati","rajesh");
		e2.disp();
		
		Employee e3 = new Employee(102,"data analyst","Pune","karan");
		e3.disp();
	}





}


