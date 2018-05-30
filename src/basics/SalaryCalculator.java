package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Lets create a variable to define our career
		// declare a variable
		String career;
		System.out.println("program is starting");
		
		// defined a variable
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		//declare & define
		int hoursPerWeek = 40;
		int	weekPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek* weekPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
		// computer our annual salary
		// rate * hoursPerWeek * weeksPerYear
	}
}
