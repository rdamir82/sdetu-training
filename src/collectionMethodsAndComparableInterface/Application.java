package collectionMethodsAndComparableInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
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

		list1.retainAll(newList);

		for (Integer value : list1) {

			System.out.println(value);
		}

		HashSet<Integer> list2 = new HashSet<Integer>();
		list2.add(12);
		list2.add(43);
		list2.add(15);
		list2.add(67);
		list2.add(43);
		list2.add(10);
		list2.add(10);
		list2.add(10);

		List<Integer> li = new ArrayList<Integer>(list2);

		ArrayList<Integer> newList2 = new ArrayList<Integer>();
		newList2.add(10);
		newList2.add(67);
		newList2.add(15);

		for (Integer value : list2) {

			System.out.println(value);
		}

	}

}
