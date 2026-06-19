package stack;

import java.util.Stack;

public class Stack_1 {

	public static void main(String[] args) {
		Stack<String> st  =new Stack <>();
		st.push("Ayush");
		st.push("Garvit");
		st.push("Amit");
		st.push("Ashish");
		System.out.println(st);
		st.pop();
		System.out.println(st);
	}
}
