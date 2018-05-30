package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		int products = multiplyNumbers(numA, numB);
		System.out.println("the Product of numbers " + numA + " and " + numB + " is " + products);
	}
	// function no parameter no return type
	static void printName() {
		System.out.println("My name is Joe");
		
	}
	// function with parameters with no return type
	static void addNumbers(int numberA, int numberB) {
		//function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA +" and " + numberB + " is " + sum);
	}
	// function with parameters with return type
	static int multiplyNumbers(int valueA, int valueB) {
		int products = valueA * valueB;
		return products;
	}
}
