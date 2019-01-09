package sdetUniversityApp;

public class UniversityApp {

	public static void main(String[] args) {

		Student st1 = new Student("Damir Rekic", "12345");

		st1.setCity("Csantaver");
		System.out.println(st1.getCity());
		st1.enroll("Phisics", 500);
		st1.enroll("Math", 900);
		st1.pay(300);
		st1.showCourses();
		System.out.println(st1.toString());
		st1.pay(1000);

	}
}

/*
 * New Student constructor that takes name and SSN in the arguments
 * Automatically create an email ID based on the name Set a private static ID
 * Generate a user ID that is combination of Static ID, random 4-digit number
 * between 1000 and 9000, and last 4 of SSN Methods: enroll(), pay(),
 * checkBalance(), toString(), showCourses() Use encapsulation to set variables
 * (phone, city, state)
 */

class Student {
	private static int iD = 1000;
	private String name;
	private String phone;
	private String city;
	private String state;
	private String sSN;
	private double balance;
	private String courses = "";

	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.sSN = ssn;

		System.out.println("New Student added:");
		System.out.println("NAME: " + name);
		System.out.println("EMAIL: " + createEmail(name));
		System.out.println("STUDENT ID: " + userID(name, sSN));
	}

	// create uniqu email
	public String createEmail(String name) {
		return ((name.replaceAll("\\s+", "")).toLowerCase() + iD + "@university.com");
	}

	// Generate user ID
	public String userID(String name, String sSN) {
		int random = (int) (Math.random() * (9000 - 1000)) + 1000;
		String last4Ssn = sSN.substring(sSN.length() - 4, sSN.length());
		String userID = iD + "" + random + last4Ssn;
		return userID;
	}

	public void enroll(String enroll, double price) {
		System.out.println(name + " enroll to: " + enroll + " for $" + price);
		balance -= price;
		courses += " " + enroll;
		checkBalance();
	}

	public void pay(double amount) {
		System.out.println("YOU PAY: $" + amount);
		balance += amount;
		checkBalance();
	}

	public void checkBalance() {
		System.out.println("YOR BALANCE: $" + balance);
	}

	public void showCourses() {
		System.out.println("YOUR COURSES:" + courses);
	}

	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Student ID Number: " + iD + "]\n[Enrolled Courses: " + courses + "]\n[Balance: $"
				+ balance + "]";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
