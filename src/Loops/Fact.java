package Loops;

public class Fact {

	public static int fact1(int num)
	{
		int total = 1;
		if (num<=0)
		{
			return 1;
		}
		
		for(;num>=1;num--)
		{
			total = total*num;
		}
		return total;
		
	}
	
	public static void main(String[] args) {
		int num = 5;
		System.out.println("factorial of given number :"+fact1(num));
		
	}
}
