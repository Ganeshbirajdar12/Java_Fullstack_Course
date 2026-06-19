package map;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {
	
	public static void main(String[] args) {
		HashMap <Integer,String> map  = new HashMap<>();
		map.put(1, "apple");
		map.put(2, "Mango");
		map.put(3, "Banana");
		
		map.forEach((k,v) -> System.out.println(k+ " " + v));
		
		for(Map.Entry<Integer,String> m: map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
