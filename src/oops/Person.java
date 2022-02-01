package oops;

public class Person {

	String name;
	int age;
	
	public Person() {
		System.out.println("Inside parent default constructor.");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	protected void display() {
		System.out.println("Inside Parent class.");
	}
}
