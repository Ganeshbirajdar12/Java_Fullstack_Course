package oops_Concept;

public class Encapsulation_1 {
	 private int empid;
	 private String ename;
	 private double esal;
	 
	 public int getEmpid() {
		 return empid;
	 }
	 public void setEmpid(int empid) {
		 this.empid = empid;
	 }
	 public String getEname() {
		 return ename;
	 }
	 public void setEname(String ename) {
		 this.ename = ename;
	 }
	 public double getEsal() {
		 return esal;
	 }
	 public void setEsal(double esal) {
		 this.esal = esal;
	 } 



	public static void main(String[] args) {
		Encapsulation_1 e1 =new Encapsulation_1();
		e1.setEmpid(101);
		e1.setEname("Rahul");
		e1.setEsal(100200.0);
		
		System.out.println("Employee Id : "+e1.getEmpid());
		System.out.println("Emaploye Name : "+e1.getEname());
		System.out.println("Employee Salary : "+e1.getEsal());
	}
	
}
