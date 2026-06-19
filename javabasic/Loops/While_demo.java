package Loops;

public class While_demo {
	
	public static void main(String[] args) {
		
		int i = 2;
		int sum = 0;
		System.out.println("sum of even number from 2 to 30");
		while(i<=50)
		{
			//System.out.println(i);
			sum =sum +i;
			i+=2;
		}
		
		System.out.println("total Result : "+sum);
	}

}
