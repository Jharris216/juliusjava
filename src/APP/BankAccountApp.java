package APP;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("4563217", 1000);
		BankAccount acc2 = new BankAccount("2174563", 2000);
		BankAccount acc3 = new BankAccount("5632417", 2500);
		
		acc1.setName("john");
		System.out.println(acc1.getName());
		acc1.makeDeposite(500);
		acc1.makeDeposite(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements Interest {
	//properties of bank account
	private static int id = 1000;	// internal ID for bank to identify people
	private String accountNumber; // ID + randdom 2-digit number + first 2 of SSN
	private static final String routingNumber = " 00540057";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		id++;
		setAccountNumber();
		
	}
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = id + "" + random + SSN.substring(0,2);
		System.out.println("your Account Number:" + accountNumber);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void payBill(double amount) {
		balance = balance-amount;
		System.out.print("Paying bill: " + balance);
		showBalance();
	}
	
	public void makeDeposite(double amount) {
		System.out.print("Making deposit: " + balance);
		balance = balance+amount;
		showBalance();
	}
	public void showBalance() {
		System.out.print("Balance: " + balance);
	}
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return "[name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[balance: " + balance + "]";
	}
}

