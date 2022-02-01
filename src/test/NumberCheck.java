package test;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("This is an even number");
		}
		else  {
			System.out.println("This is an odd number");
		}
		
		input.close();
	}

}
