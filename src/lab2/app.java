package lab2;

public class app {

	public static void main(String[] args) {
		// Create studen
		Student stu1 = new Student("Jim","123456789");
		//Student stu2 = new Student("thomas","123456554");
		//Student stu3 = new Student("Alex","123456744");
		//Student stu4 = new Student("Leda","1234565452");
		
		stu1.enroll("Math");
		stu1.enroll("Science");
		stu1.enroll("History");
		
		//stu1.showCourses();
		stu1.payTutition(1000);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}

}

class Student {
	// Properties
	private static int id = 100;
	private String userID;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String State;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	
	// Constructors:
	
	public Student(String name, String ssn) {
		id++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		//System.out.println("Student created");
		setEmail();
	}
	
	private void setEmail() {
		email = (name.toLowerCase() + "." + id + "@uni.com");
		System.out.println("Your email is: " + email);
	}
	
	private void setUserID() {
		int random = (int) (Math.random() * (9000 - 1000)) + 1000;
		userID = id + "" + random + ssn.substring(ssn.length() - 4);
		System.out.println("Your User ID: " + userID);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		balance += costOfCourse; 

		//checkBalance();
	}
	
	public void payTutition(int amount) {
		System.out.println("Payment: $" + amount);
		balance -= amount;
		
		//checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String toString() {
		return "[NAME: " + name + " ]\n" +
			   "[COURSES: " + courses + " ]\n"+
			   "[BALANCE: $" + balance + " ]\n";
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
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	
	
	
}