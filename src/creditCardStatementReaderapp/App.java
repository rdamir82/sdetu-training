package creditCardStatementReaderapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Double balance = 0.00;

		// Read CC CSV statement
		List<String[]> data = new ArrayList<String[]>();
		String filename = "E:\\wamp64\\www\\SDET Uni\\files\\ccCSV.csv";
		String dataRow;

		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));

			// Read data as long as it's not empty
			while ((dataRow = br.readLine()) != null) {
				// Parse the data by commas
				String[] line = dataRow.split(",");
				// Add the data to collection
				data.add(line);
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String a[] : data) {
			if (a[1].equals("CREDIT")) {
				balance += Double.valueOf(a[3]);
				System.out.println("At " + a[0] + " You spend at " + a[2] + " $" + a[3]);
				System.out.println("Your Balance: $" + balance);
			} else if (a[1].equals("DEBIT")) {
				balance -= Double.valueOf(a[3]);
				System.out.println("At " + a[0] + " You added at " + a[2] + " $" + a[3]);
				System.out.println("Your Balance: $" + balance);
			} else if (a[1].equals("FEE")) {
				balance += Double.valueOf(a[3]);
				System.out.println("On Your balance is added Fee $" + a[3]);
				System.out.println("Your Balance: $" + balance);
			}
		}

		if (balance > 0) {
			balance *= 1.1;
			System.out.println("You are charged with 10% because of depth: $" + balance);
		}
		if (balance == 0) {
			System.out.println("thank You for the payments your balance is: $" + balance);
		}
		if (balance < 0) {
			System.out.println("thank You  for the payment! Your overpayment: $" + balance);
		}

	}

}
