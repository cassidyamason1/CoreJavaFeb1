package test;

public class ReversalExamples {

	public static void main(String[] args) {
		
		//Reverse a string
		String str1 = "Cassidy Amason";
		String revStr = "";
		
		for (int i=str1.length()-1; i>=0; i--) {
			revStr = revStr + str1.charAt(i);
			
		}
		System.out.println("The reverse of Cassidy Amason is: " + revStr);
		
		
		//Count the number of vowels in a word. How to handle capitals?
		int count = 0;
		for (int i=0; i<str1.length() ; i++) {
			if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
				count ++;
			}
		}
		System.out.println(count);
		
		//Reverse an array
		int[] num = {20,30,40,50,60};
		
		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
		
		
		//Reverse a number
		int a = 63755;
		int reversed = 0;
		
		while(a>0) {
		int remainder = a % 10;
		reversed = reversed*10 + remainder;
		a = a / 10;
		}
		System.out.println("The reversed value is: " + reversed + "!");
		
		int b = 8264811;
		String str2 = String.valueOf(b);
		String[] str3 = str2.split("");
		
		System.out.print("Another reversed value is: ");
		for(int i=str3.length-1; i>=0; i--) {
			System.out.print(str3[i]);
		}
	
		
	}

}
