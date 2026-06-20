package inheritance;

public class Main extends Input {
	
	public static void main(String[] args) {
		 
		Input in = new Input();
		in.getData();
		
		
		
		AreaOfTriangle t1 = new  AreaOfTriangle();
		t1.l1 = in.l;
		t1.w2 = in.w;
		System.out.println("Area Of Triangle : "+t1.cal());
		
		
		AreaOfSquare a1 = new  AreaOfSquare();
		a1.side1 = in.side;
		System.out.println("Area Of Square : "+a1.cal());
		
		
		AreaOfCircle c1 = new  AreaOfCircle();
		c1.r1 =in.r;
		System.out.println("Area Of Circle : "+c1.cal());
		 
	}

}
