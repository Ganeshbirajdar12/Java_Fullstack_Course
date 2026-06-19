package array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
		List <Integer> l1 = new ArrayList <>();
		 l1.add(10);
		 l1.add(20);
		 l1.add(30);
		 
		 Iterator<Integer> itr  = l1.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 
	}

}
