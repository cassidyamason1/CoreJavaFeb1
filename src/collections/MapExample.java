package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "Cass");
		map1.put(2, "Drew");
		map1.put(3, "Layla");
		map1.put(4,"Adam");
		
		System.out.println(map1);
		
		//update the data
		map1.put(2, "John");
		
		System.out.println(map1);
		
		for(Map.Entry<Integer, String> entry1 : map1.entrySet()) {
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		}
		
		for(Integer val : map1.keySet()) {
			System.out.println("The Key is: "+ val);
			System.out.println("The value is: " + map1.get(val));
		}
		
		for(String val : map1.values()) {
			System.out.println("The value is: " + val);
		}
		
		//===============================================
		
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		map2.put(1, "Cass");
		map2.put(2, "Drew");
		map2.put(3, "Layla");
		map2.put(4,"Adam");
		
		System.out.println(map2);
		
		//================================================
		//ascending order by key
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		map3.put(1, "Cass");
		map3.put(4, "Drew");
		map3.put(2, "Layla");
		map3.put(3, "Adam");
		
		System.out.println(map3);
		
		//==================================================
		//Interview Q: Count the occurance of each word in a string
		
		String str1= "Clean India Green India Love India";
		
		
	}

}
