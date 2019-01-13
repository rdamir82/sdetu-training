package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// 1. define the file (path) to read
		String filename = "E:\\wamp64\\www\\SDET Uni\\files\\FileToRead.txt";
		String text = null;

		// 2. create the file object in Java
		File file = new File(filename);

		// 3. Open the file
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));

			// 4. Read the file

			text = br.readLine();
			
			// 5. Close the resources
			
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("ERROR: file not found " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the data: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finisher reading the file");
		}

		System.out.println(text);

	}

}
