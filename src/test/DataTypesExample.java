package test;

public class DataTypesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 20;
		int num2 = 30;
		
		int sum = num1 + num2;
		float div = (float) num2/num1;
		
		String result = "The sum of 2 numbers is: " + sum;
		
		System.out.println(result);
		System.out.println(div);
		
		//total number of characters, doesn't start at 0
		String name = "Cassidy Amason";
		System.out.println("The total number of characters are: " + name.length());
		
		char char1 = name.charAt(0);
		char char2 = name.charAt(name.length() -1 );
		System.out.println("The char at position 0 is: " + char1);
		System.out.println("The char at the last position is: " + char2);
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
	}

}
