package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// create a new bank account >> think instantiate an object
	
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "1234567";
		acc1.name = " Jaden smith";
		acc1.balance = 1000;
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		
		System.out.println(acc1.toString());	
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "7654321";
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.accountNumber = "3217456";
		acc3.checkBalance();
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "seth";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		
	}

}
