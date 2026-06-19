package linkedList;

import java.util.*;
public class LinkedList_1 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkList = new LinkedList<>();
		linkList.add(10);
		linkList.add(20);
		linkList.add(30);
		linkList.add(40);
		 
		List<Integer> li = new ArrayList<>();
		li.add(50);
		li.add(60);
		li.addAll(linkList);
		
		System.out.print("Array List : ");
		li.forEach(x -> System.out.print(x + " "));
	}

}
