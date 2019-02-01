package collections04MethodsAndComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {

	/*	ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);
		list1.add(10);

		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		newList.add(67);
		newList.add(15);
*/
		// merge list addAll()

		// list1.addAll(newList);

		// remove all removeAll()

		// list1.removeAll(newList);

		// clear the list clear()

		// list1.clear();

		// check if value exists contains()

		// boolean hasValue = list1.contains(6);

		// System.out.println(hasValue);

		// check if array is empty

		// boolean isEmpty = list1.isEmpty();

		// System.out.println(isEmpty);

		// Remove values except declared retainAll();

		// list1.retainAll(newList);

		// for (Integer value : list1) {

		//	System.out.println(value);
		// }

		
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Mike", 3500, "Accounting"));
		hashSet.add(new Employee("Paul", 3000, "Admin"));
		hashSet.add(new Employee("Peter", 4000, "IT"));
		hashSet.add(new Employee("Angel", 2000, "Maint"));

		
		ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
		

		// Converting lists:
		
		// List<Integer> li = new ArrayList<Integer>(list1);

		// ArrayList<Integer> newList = new ArrayList<Integer>();


	}

}
