package test;

public class ArraysExample {

	public static void main(String[] args) {
		int[] x = {20,30,40,50};
		System.out.println("The total number of values are: " + x.length);
		System.out.println("The value at the last position is: " + x[x.length -1]);
		
		String[] names = {"Cassidy", "Lauren", "Amason"};
		System.out.println("The value at the 3rd position is: " + names[2]);
		
		//find the total number of words interview question
		String name1 = "Cassidy Lauren Amason McCorkle";
		String[] arrWords = name1.split(" ");
		System.out.println("The 2nd word is: " + arrWords[1]);
		System.out.println("The total number of words is: " + arrWords.length);
	}
	
	
}
