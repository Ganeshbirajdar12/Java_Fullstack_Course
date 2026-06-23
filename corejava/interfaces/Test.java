package interfaces;

public class Test implements Interface_1{
	int total;
	int count = 3;
	public void sum(int a, int b, int c) {
		 total = a+b+c;
		 System.out.println("sum :" + total);
		
	}

	public void avg(int total, int count) {
		int avg = total/count;
		System.out.println("Average is : "+avg);
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.sum(10, 20, 30);
		t1.avg(60,3);
	}

}
