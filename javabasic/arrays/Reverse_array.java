package arrays;

public class Reverse_array {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int last = arr.length - 1 ;
		for( int i=0; i<arr.length; i++)
		{
			 int temp = arr[i];
			 arr[i] = arr[last];
			 arr[last] = temp;
			last--;
		}
		
		for( int i =0 ; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
			
		}
		
	}
}
