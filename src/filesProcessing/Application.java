package filesProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		// input from keyboard (String) import java.util.Scanner;
		/*
		 * for(int i = 0; i <= 3; i ++) { Scanner input = new Scanner(System.in);
		 * System.out.println("Enter same text:"); String enterdeText =
		 * input.nextLine(); System.out.println(enterdeText); }
		 */
		try {
			// input from file
			File file = new File("C:\\Users\\korisnik\\eclipse-workspace\\JavaTraining\\src\\filesProcessing\\myfile");
			Scanner input;

			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();

		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND!");
//			e.printStackTrace();
		}

		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.subtract10FromLargerNumber(119));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
