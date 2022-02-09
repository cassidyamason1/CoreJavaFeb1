package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("Nik");
		pq1.add("Matthew");
		pq1.add("Lisa");
		
		System.out.println(pq1); //no sequential order
		
		System.out.println(pq1.peek()); //show first element
		pq1.poll(); //removes the first element
		
		System.out.println(pq1);
		
		ArrayDeque<String> dq1 = new ArrayDeque<String>();
		
		dq1.add("Nik");
		dq1.add("Nik"); //duplicate values are allowed, null values are not allowed
		dq1.add("Matthew");
		dq1.add("Lisa");
		
		System.out.println(dq1); //sequential order
		
		System.out.println(dq1.peek());
		System.out.println(dq1.peekFirst());
		System.out.println(dq1.peekLast());
		
		dq1.poll();
		dq1.pollFirst();
		dq1.pollLast();
		
		System.out.println(dq1);
	}

}
