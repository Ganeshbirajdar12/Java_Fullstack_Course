package oops_Concept;

public class Calculations {
	
	int l,b,r,h;

	public Calculations(int l, int b, int r, int h) {
		
		this.l = l;
		this.b = b;
		this.r = r;
		this.h = h;
	}
	
	public double paramter()
	{
		return 2*(l*b);
	}
	
	public double volume_of_cylender()
	{
		return 3.14*r*r*h;
	}

}
