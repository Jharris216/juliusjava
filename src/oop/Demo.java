package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}


public class Demo {
 public static void main(String[] args) {
	 // instantiating an object
	 Person person1 = new Person();
	 
	 // define some properties
	 person1.name = "john";
	 person1.email = "john@gmail.com";
	 person1.phone = "2544541234";
	
	 // Abstraction
	 person1.walk();
	 person1.sleep();
	 person1.eat();
	 
	 Person person2 = new Person();
	 person2.name = "joe";
	 person2.sleep();
	 
	 /*
	 //Person
	 //Attributes, variables, adjectives, descriptiors
	 String name = "joe";
	 String email = "joe@gmail.com";
	 String phone = "2544547894";
	 
	 //Action, activity, behavior
	 walking(name);
	 System.out.println(name + " is eating");
	 
	 // what if we wanted another person
	 String name2 = "john";
	 String email2 = "john@gmail.com";
	 String phone2 = "2544541234";
	 
	 //Action, activity, behavior
	 walking(name2);
	 System.out.println(name2 + " is eating");
	 
	 // what about binding attributes and properties together
	 
 }
 
 //Enhance by adding functions to minimize code
 static void walking(String name) {
	 System.out.println(name + " is walking");
	 */
 }
}
