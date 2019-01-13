package passwordValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PasswordValidator {

	public static void main(String[] args) {
		// load file
		String filename = "E:\\wamp64\\www\\SDET Uni\\files\\passwords.txt";
		File file = new File(filename);
		String[] passwords = new String[13];
		String password = null;
		Boolean isAlphabet = false;
		Boolean isNumeric = false;
		Boolean isSpecial = false;
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = br.readLine();
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: File is corrupt!");
			e.printStackTrace();
		}

		for (int j = 0; j < passwords.length; j++) {
			password = passwords[j];
		try {
			for( int i = 0; i < password.length(); i++ ) {
								
				if (Character.isLetter(password.charAt(i))) {
					isAlphabet = true;
				} else if (Character.isDigit((password.charAt(i)))) {
					isNumeric = true;
				} else if ("!@#$%^&*()_+=-/.,><?{};".contains(password.substring(i,i+1))) {
					//System.out.println("position " + n + " contains a special");
					isSpecial = true;
				}
			};
			if(!isAlphabet) {
				throw new AlphabetException(password);
			}
			if(!isNumeric) {
				throw new NumericException(password);
			}
			if(!isSpecial) {
				throw new SpecialException(password);
			}
			
		} catch (AlphabetException e) {
			System.out.println(password + " ERROR: no alphabet char in password!");
			System.out.println(e.toString());
		} catch (NumericException e) {
			System.out.println(password + " ERROR: no numeric char in password!");
			System.out.println(e.toString());
		} catch (SpecialException e) {
			System.out.println(password + " ERROR: no special char in password!");
			System.out.println(e.toString());
		}
		
		if(isAlphabet && isNumeric && isSpecial) {
			System.out.println(password + " is correct!");
		}
		isAlphabet = false;
		isNumeric = false;
		isSpecial = false;
		}
	}

}

class AlphabetException extends Exception  {
	String password;
	
	AlphabetException(String password){
	this.password = password;
	}
	public String toString() {
		return ("AlphabetException: " + password);
	}
}

class NumericException extends Exception  {
	String password;
	
	NumericException(String password){
	this.password = password;
	}
	public String toString() {
		return ("NumericException: " + password);
	}
	
}

class SpecialException extends Exception  {
	String password;
	
	SpecialException(String password){
	this.password = password;
	}
	public String toString() {
		return ("SpecialException: " + password);
	}
	
}

