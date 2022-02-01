package test;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
//counting vowels		
		String str1 = "Cassidy McCorkle";
		int vowelCount = 0;
		
		for(int i =0; i<str1.length(); i++) {
			char temp = str1.charAt(i);
			switch(temp) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount += 1;
				break;
			}
			
		}
	//	System.out.println("The total number of vowels are: " + vowelCount);

		String input;
		String input2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to count the vowels: ");
		input = s.nextLine();
		input2 = input.toLowerCase();
		
		int vowelCount2 = 0;
		
		for(int i =0; i<input2.length(); i++) {
			char temp = input2.charAt(i);
			switch(temp) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount2 += 1;
				break;
			}
	}
		System.out.println("The total number of vowels are: " + vowelCount2);
		s.close();
}
}
