package oops;

public class Employee {

	String name;
	int employeeId;
	public static int salary = 100000;
	public static String companyName = "Blue Yonder";
	
	public Employee(String name, int employeeId, int salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	public Employee() {
		
	}
	
	public void PrintName() {
		System.out.println("Name of employee: " + name);
	}
	public void PrintSalary() {
		System.out.println("The salary of " + this.name + " is: " + Employee.salary );
	}
	public static void ChangeCompanyName() {
		Employee.companyName = "HCL";
	}
	
}
