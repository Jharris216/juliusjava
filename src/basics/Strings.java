package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "world";
		bookTitle = "the new world";
		
		//.contains in API
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}

		String firstName = "joe";
		String lastName = "Smith";
		String ssn = "123456789";
		
		System.out.println("There are " + ssn.length() + " digits in your ssn.");
	
				
		//Print the initials plus last 4 digits of ssn
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(ssn.substring(5));
	}

}
