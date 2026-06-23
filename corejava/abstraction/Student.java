package abstraction;

public class Student {
	
	String name;
	String address;
	static int marks = 75;
	
	  public void update(int mark)
	{
		marks = mark;
	}
	
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	void disp()
	{
		System.out.println("name : "+name );
		System.out.println("address : "+address);
		System.out.println("marks : "+marks);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("rajesh","Baramati");
		s1.update(85);
		s1.disp();
	}

}
