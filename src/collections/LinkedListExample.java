package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("John");
		list1.add("Mike");
		list1.add("Donald");
		list1.add("Jessica");
		list1.addFirst("Rick");
		list1.add(2, "Cass");
		
		
		System.out.println(list1);
		

	}

}
