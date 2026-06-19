package Loops;

public class sum_of_even {

	public static void main(String[] args) {
		
		int sum =0;
		for (int i = 2; i<=50; i+=2)
		{
			sum = sum+i;
		}
		
		System.out.println("Total result is : " + sum);
	}
}
