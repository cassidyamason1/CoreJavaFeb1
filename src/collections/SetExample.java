package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		//cannot enter any duplicate values in a set
		//ex: hash set
		//can add a value of null (just once though)
		
		
		HashSet<String> set1 = new HashSet<String>(); //random order
		//does allow null value
		set1.add("Cass");
		set1.add("Drew");
		set1.add("Layla");
		set1.add("Maui");
		set1.add("Kid1");
		set1.add("Kid2");
		System.out.println(set1);
		
		LinkedHashSet<String> set3 = new LinkedHashSet<String>(); //stores data in order of entry
		//does allow null value
		set3.add("Cass");
		set3.add("Drew");
		set3.add("Layla");
		set3.add("Maui");
		set3.add("Kid1");
		set3.add("Kid2");
		System.out.println(set3);
		
		TreeSet<String> set4 = new TreeSet<String>(); //stores data in ascending order/alphabetical.
		//does not allow null value
		set4.add("Cass");
		set4.add("Drew");
		set4.add("Layla");
		set4.add("Maui");
		set4.add("Kid1");
		set4.add("Kid2");
		System.out.println(set4);
		
		
		//Remove all duplicates in the string using set:
				String str1 = "Clean World Green World";
				String result = "";
				
				String[] arr1 = str1.split(" ");
				
				LinkedHashSet<String> str2 = new LinkedHashSet<String>(Arrays.asList(arr1));
				 
				//convert to a string next
				for (String word: str2) {
					result = result + word + " ";
				}
				
				System.out.println("Sentence after removing duplicate words: " + result);
		
		
		String str3 = "Cassidy is happy happy";
		LinkedHashSet<String> str4 = new LinkedHashSet<String>();
		
		for (String word1: str3.split(" ")) {
			str4.add(word1);
		}
		System.out.println(str4);
		
	}

	
}
