package oops;

public class ChildClass extends Person{

	String profession;
	public ChildClass() {
		System.out.println("Inside child default constructor.");
		
	}
	public ChildClass(String name, int age, String profession) {
		super(name,age); //call parent class constructor 
		this.profession = profession;
	}
	
	public void display() {
		System.out.println("Inside child");
	}
	
	public void print() {
		
		System.out.println("Inside child class.");
	}
}
