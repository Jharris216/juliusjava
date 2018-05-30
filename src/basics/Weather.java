package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestions of what to wear based on weather
	int temperature = 20;
		String sunCondition = "Overcast";
	if (temperature > 80) {
		System.out.println("It's good to wear shorts and t shirt");
	}
	else if (temperature > 60) {
		System.out.println("It's a little chilly, so wear a long shirt and pants");
	}
	else if ((temperature > 50)|| (sunCondition == "Overcast")) {
		System.out.println("It's a little chilly, so wear a long shirt and pants");
	}
	else {
		System.out.println("looks like a cold day. bring a jacket");
	}
	System.out.println("The program is ending");
	}
}
