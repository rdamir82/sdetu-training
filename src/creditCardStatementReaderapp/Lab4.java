package creditCardStatementReaderapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4 {

	public static void main(String[] args) {
		// Read CC CSV statement
		List<String[]> transactions = new ArrayList<String[]>();
		String filename = "E:\\wamp64\\www\\SDET Uni\\files\\ccCSV.csv";
		String dataRow;
		double balance = 0;

		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));

			// Read data as long as it's not empty
			while ((dataRow = br.readLine()) != null) {
				// Parse the data by commas
				String[] line = dataRow.split(",");
				// Add the data to collection
				transactions.add(line);
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String[] transaction : transactions) {
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			Double amount = Double.parseDouble(transaction[3]);
			
			System.out.println(date + " " + type + " " + vendor + " " + amount);
			
			if (type.equalsIgnoreCase("credit")) {
				balance += amount;
				System.out.println("Add to balance");
			}
			else if (type.equalsIgnoreCase("debit")) {
				balance -= amount;
				System.out.println("Subtract from balance");
			} else {
				System.out.println("Some other transaction");
			}
			System.out.println("New balance: $" + balance);
			
		}
		
		// Check the balance
		if(balance > 0) {
			System.out.println("You have a balance of " + balance);
			System.out.println("You are charged a 10% fee of " + balance * 0.1);
			System.out.println("Your new balance is: $" + balance * 1.1);
		}
		else if (balance < 0) {
			System.out.println("Thank you!");
			System.out.println("You have a overpayment of  -$" + balance);
		}
		
		else {
			System.out.println("Thank you!");
		}
		
		

	}
	
	

}
