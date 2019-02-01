package collections03hashSetandLinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		
		// The set is used to prevent duplicates.
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(67);
		values.add(43);
		
		for(Integer value : values) {
			System.out.println(value);
		}
		
		// Notice there is no order that's being managed here doesn't it doesn't care about the order.
		// All it cares about is unique values.
		
		// The set is very useful for unique values and order is not managed here.
		HashSet<String> strings = new HashSet<String>();
		strings.add("Random");
		strings.add("Animal");
		strings.add("People");
		strings.add("Random");
		strings.add("Random");
		
		for(String value : strings) {
			System.out.println(value);
		}
		
		LinkedHashSet<String> strings2 = new LinkedHashSet<String>();
		strings2.add("Random");
		strings2.add("Animal");
		strings2.add("People");
		strings2.add("Zoo");
		strings2.add("Car");
		
		for(String value : strings2) {
			System.out.println(value);
		}
		// it is in fact order of insertion because we use a linked hash set but duplicates are still not allowed.
		
		
		// So that's really the only difference between a linked hash set and a regular hash set the linked hash
		// set maintains the insertion order whereas the hash set doesn't care about order.
		
		
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 8);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangaroo", 24);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		System.out.println(animal1.equals(animal4));

		// If the hash codes of two objects are the same only then it prevents duplicates in our current situation.	
		
		System.out.println(animal1.hashCode());
		System.out.println(animal4.hashCode());
		// if we do not override hash code all objects use their parent objects hash code implementation and
		
		for(Animal value : animals) {
			System.out.println(value.toString());
		}
		
		/*
		    So a quick review the hash set is used to ensure unique values when you're inserting numbers or strings.

			It's very quickly able to you know prevent duplicates from being inserted but when you have a user defined
			
			object such as in our case we have the animal we create instances of the animal.
			
			It's not able to differentiate between two objects even if they have the same field values it's not
			
			able to identify the uniqueness there.
			
			What we need to do is we need to override the equals as well as the hash code method.
			
			In the in the class in the animal class in this case and once those are overwritten only then would
			
			the hash set be able to manage uniqueness for these user defined objects and to implement the equals
			
			and hash code is very simple you just go to the actual class that you created like we did here.
			
			And it's just a matter of doing right click and go to source and generate the hash code and equals right.
		 */
	
	
	}

}
