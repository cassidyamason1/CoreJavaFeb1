package oops;

public abstract class BankExample {
	
	public abstract void checkBalance(); //abstract means no body needed
	
	public abstract void depositMoney(); 
	
	public abstract void withdrawMoney();
	
	public void Welcome() {
		System.out.println("Welcome to LGE banking!");
	}
}
