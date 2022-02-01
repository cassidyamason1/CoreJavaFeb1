package test;

public class LoopsExample {

	public static void main(String[] args) {
		
	
		for (int i=10; i>=1; i--) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("------");
		
		int num1 = 1;
		while (num1 < 11) {
			if (num1 == 5) {
				num1 += 1;
				continue;
			}
			System.out.println(num1);
			num1 +=1;
		
		
		}
		//Arrays with loop
		
		int[] array1 = {20,30,40,50,60};
		
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		for (int value:array1) {
			System.out.println(value);
		}
	}

}
