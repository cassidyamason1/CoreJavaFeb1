package oops;

public class RunnerClass {

	public static void main(String[] args) {
		/*	Employee emp1 = new Employee();
		emp1.name = "Cassidy";
		emp1.employeeId = 3333;
		emp1.salary = 80000;
		
		Employee emp2 = new Employee();
		emp2.name = "Andrew";
		emp2.employeeId = 3334;
		emp2.salary = 90000;
		
		emp1.PrintName();
		emp2.PrintName(); */
		
		
		
		//Employee emp1 = new Employee("Cassidy", 3333, 80000);
		//Employee emp2 = new Employee("Andrew", 3334, 90000);
		Employee emp3 = new Employee("Lauren", 4444);
		emp3.PrintSalary();
		Employee.ChangeCompanyName();
		Employee emp4 = new Employee();
		
		Person per1 = new Person();
		Person per2 = new ChildClass();
		
		ChildClass child1 = new ChildClass("Cass", 26, "QAE");
		//ChildClass child2 = new ChildClass();
		child1.display(); //overriding parent method
		per1.display();
		
		System.out.println(child1.profession);
		
		MethodOverLoadingExample obj = new MethodOverLoadingExample();
		obj.sum(4,5);
		obj.sum(2,5,66);
		
		//BankExample bank = new BankExample(); can't create an object from abstract class
		LGEBank bank1 = new LGEBank(); //object via the child class works
		
		EncapsulationExample obj10 = new EncapsulationExample();
		obj10.setName("Cassidy McCorkle");
		System.out.println(obj10.getName());
	}

}
