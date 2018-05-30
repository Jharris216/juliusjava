package Studentdb;

public class Students {

	public static void main(String[] args) {
		// create a student
		Student stu1 = new Student("Tim", "1234567");
		Student stu2 = new Student("Bob", "5612347");
		Student stu3 = new Student("Sam", "1456723");
		
		stu1.enroll("Math101");
		stu1.enroll("Eng200");
		stu1.enroll("Hist200");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}
}
	class Student {
	//properties
	private static int id=1000;	
	private String userId;
	private String name;
	private String phone;
	private String state;
	private String city;
	private String ssn;
	private String email;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance=0;
	
	public Student(String name, String ssn) {
		id++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + id + "@university.com";
		System.out.println("your email: " + email);
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setUserId() {
		//random number 1000 and 9000
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum + min;
		userId = id + "" + randNum + ssn.substring(5);
		System.out.println("Your User id: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		balance = balance + costOfCourse;
	}
	public void payTuition(int amount) {
		System.out.println(" \npayment: $" + amount);
		balance = balance - amount;
	
	}
	public void checkBalance() {
		System.out.print("Balance: $" + balance);
	}
	public void showCourses() {
		System.out.println(courses);
	}
	public String toString() {
		return "[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: " + balance + "] ";
	}
}
