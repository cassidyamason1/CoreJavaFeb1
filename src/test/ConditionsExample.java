package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to vote!");
		}
		else if (age == 17) {
			System.out.println("You have one more year to go, try again next year to vote!");
		}
		else {
			System.out.println("You are not eligible to vote, sorry!");
		}
		input.close();
	}

}
