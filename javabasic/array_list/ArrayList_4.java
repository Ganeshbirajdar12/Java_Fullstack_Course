package array_list;
import java.util.*;
public class ArrayList_4 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		List<Integer> list =  new ArrayList<>();
		int num;
		for(int i = 0; i<7; i++)
		{
			System.out.print("Enter the Number : ");
			num = sc.nextInt();
			if(!list.contains(num))
			{
				list.add(num);
			}
			else 
			{
				System.out.println("Duplicate value does not allow");
				System.out.print("Enter the Number : ");
				num = sc.nextInt();
			}
		}
		
		sc.close();
		System.out.print("ArrayList : ");
		list.forEach(x -> System.out.print(x + " "));
		
		
	}

}
