package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int num = 10;
		int[] array1 = {5, 67, 88, 67};
		try {
			int result = num/2;
			System.out.println(array1[10]);
			
		}catch(ArithmeticException e ) {
			System.out.println("Arith exception inside catch block");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bounds exception");
		}catch(Exception e) {
			System.out.println("exception inside catch block");
		}finally {
			System.out.println("inside finally block");
		}
		
		System.out.println("after try and catch");
	}

}
