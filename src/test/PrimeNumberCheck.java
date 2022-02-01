package test;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
	
		int input; 
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100 to see if it is prime or not: ");
		input = s.nextInt();
		if (input == 1 || input ==2 || input ==3) {
			System.out.println("This is a prime number!");
		}
		else if (input % 2 == 0 || input % 3 == 0) {
			System.out.println("This is not a prime number!");
		}
		else if (input > 100) {
			System.out.println("Try again with a number between 1 and 100.");
		}
		else {
			System.out.println("This is a prime number.");
		}

	}

}
