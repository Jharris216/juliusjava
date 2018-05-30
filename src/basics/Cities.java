package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"Yorker", "chicago", "smyrna", "Atlanta"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		System.out.println("********");
		// declare and define the array with size
		String[] states = new String[6];
		states[0] = "New york";
		states[1] = "cal";
		states[2] = "vancover";
		states[3] = "Telsa";
		states[4] = "miami";
		states[5] = "smyrna";
		int i=0;
		
		// do loop: enters loop then test condition
		do {
			System.out.println("State: " + states[i]);
			i = i + 1;
		} while(i <5);
		//while loop test the condiction first then enter loop
		int n;
		while(n <= 4) {
			System.out.println("State at " + n + ":" + states[0]);
		}
	}
	}


