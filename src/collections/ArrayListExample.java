package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;


public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Cass");
		arrayList1.add("Drew");
		arrayList1.add("Maui");
		arrayList1.add("Layla");
		
		System.out.println("The size of array list is: " +arrayList1.size());
		System.out.println(arrayList1.get(0));
		
		//arrayList1.remove(1);
		System.out.println("The size of array list is: " +arrayList1.size());
		System.out.println(arrayList1);
		
		arrayList1.set(0, "Cassidy"); //replace the value at 0 position
		
		//iterating through array list:
		
		for(int i=0;  i<arrayList1.size(); i++) {
			System.out.println(arrayList1.get(i));
		}
		for (String name: arrayList1) {
			System.out.println(name);
		}
		
		Iterator<String> itr = arrayList1.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//sorting in ascending order. How to sort in descending order?
		Collections.sort(arrayList1);
		System.out.println(arrayList1);
		

	}

}
