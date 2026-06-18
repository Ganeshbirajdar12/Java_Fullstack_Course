package array_list;
import java.util.*;
public class Array_List_3 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		List <String> names  = new ArrayList<>();
		for(int i=0; i<5; i++)
		{
			System.out.print("Enter Names : ");
			names.add(sc.next());
		}
		
		System.out.print("names : ");
		names.forEach(x -> System.err.print(x + " "));
		
		sc.close();
	}
}
