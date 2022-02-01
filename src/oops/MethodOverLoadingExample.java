package oops;

public class MethodOverLoadingExample {
	
	public void sum(int a, int b) {
		
		int result = a+b;
		System.out.println("The sum is: " + result);
	}
	public void sum(int a, int b, int c) {
		
		int result = a+b+c;
		System.out.println("The sum is: " + result);
	}

}
