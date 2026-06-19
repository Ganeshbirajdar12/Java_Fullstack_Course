package Loops;

public class Sum_of_odd {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i<=30; i+=2)
		{
			sum = sum+i;
		}
		
		System.out.println("sum of odd numbers : "+sum);
	}
}
