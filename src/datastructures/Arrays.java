package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = { "a", "b", "c", "d", "e", "f" };

		System.out.println("\nUsing length properties");
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
		System.out.println("\nUsing for each method");
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}
		
		String[][] users = { 
					{"John","Williams","jv@gmail.com","5646541"},
					{"Sarah", "Jackson", "sj@gmail.com","46546541"},
					{"Rachel","Wallace", "rv@gmail.com", "5465425"}
				};
		// Get the size of the array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		
		System.out.println("\n\nNumber of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		// Traverse the double array
		
		for(int i = 0; i < numOfUsers; i++) {
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			
			System.out.println(firstName + " " + lastName + " " + email + " " + phone);
			
		}
		
		System.out.println("\nUsing FOR EACH:");
		
		for (String[] user : users) {
			System.out.println("");
			for (String field : user) {
				System.out.print(field + " ");
			}
		}
	}

}
