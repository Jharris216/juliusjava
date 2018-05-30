package oop;

public class BankAccount {
	//Define variables
	String accountNumber;
	// static belong to the class not the object instance
	// final constant often static with final
	
	// static variable
	private static final String routingNumber = "76556";
	
	// Instance variables
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definition: unique methods
	// 1 They are used to define setup and initialize properties of an object
	// 2 Constructors are Implicity called upon instantiation
	// 3 The same name as the Class itself
	// 4 Constructor have no return type at all. no void needed
	
	BankAccount(){
		System.out.println("New Account Created");
	}
	
	//Overloading: call same mehod name with different argument
	BankAccount(String accountType){
		System.out.println("New Account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		//initDeposit,accountType, Msg are all local veriables that are assigned within blocks
		System.out.println("New Account: " + accountType);
		System.out.println("Initial deposit of: $ " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: minimum deposit must be at least $1,500";
		} else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
			System.out.println(Msg);
			balance = initDeposit;
	}
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("withdraw");
	}
	
	//Private can only be called within the class
	private void showActivity(String activity) {
		System.out.println("Your resent transaction" + activity);
		System.out.println("Your new balance is: " + balance);
	}
	
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	void getStatus() {
	
	}
	
	
	@Override
	public String toString() {
		return " [Name: " + name + ". " + accountNumber + ". Balance: $" + balance +"]";
	}
	
}
