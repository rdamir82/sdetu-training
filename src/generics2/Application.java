package generics2;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Object myObject = new Object();
		String myVar = "Hello";
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
			
		emp = acc;
		
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());		
		ArrayList<Accountant> accountants = new ArrayList<Accountant>();
		accountants.add(new Accountant());
		// employees = accountants; // throw error because now they aren't the same
		
		ArrayList<?> employees2 = new ArrayList<>();  // WildCard
		ArrayList<Accountant> accountants2 = new ArrayList<>();
		
		employees2 = accountants2; // Using wild-card we can assign one array list to another 
		
		// upper bound
		ArrayList<? extends Employee> employees3 = new ArrayList<>(); 
		// this basically means that this is a list that accepts data of type employee 
		// as well as children of employee.
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		// only children of the Employee class could go into this employee's through the list
		employees3 = accountants3;
		
		
		// Lower bound
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		// This is saying that the lowest element that can go in here lowest type I can go here is employee.
		// ArrayList<Accountant> accountant4 = new ArrayList<>(); 
		// employees4 = accountants4; // compile error because we try to assign lower element type in hierarchy 
		ArrayList<Object> accountants4 = new ArrayList<>();
		employees4 = accountants4; // compile because Object is higher than Employee
		
		makeEmployeeWork(employees);
		makeEmployeeWork(accountants);
		
	}

	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee emp : employees) {
			emp.work();
		}
	}
}
