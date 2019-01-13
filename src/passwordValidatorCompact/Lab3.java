package passwordValidatorCompact;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab3 {

	public static void main(String[] args) {
		// load file
		String filename = "E:\\wamp64\\www\\SDET Uni\\files\\passwords.txt";		
		String[] passwords = new String[13];
		
		File file = new File(filename);
		
		
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
		
		// Test against our criteria
		for (String password : passwords) {
			System.out.println("******\n" + password);
			
			Boolean isAlphabet = false;
			Boolean isNumeric = false;
			Boolean isSpecial = false;
			Boolean isInvalid = false;
			
			for (int n = 0; n < password.length(); n++ ) {
			// Condition 1 : Contains number
			if ("0123456789".contains(password.substring(n,n+1))) {
				//System.out.println("position " + n + " contains a number");
				isNumeric = true;
			}
			// Condition 2 : Contains letter
			else if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(password.substring(n,n+1))) {
				//System.out.println("position " + n + " contains a letter");
				isAlphabet = true;
			}
			// Condition 3 : Contains spec char
			else if ("!@#$%^&*()_+=-/.,><?{};".contains(password.substring(n,n+1))) {
				//System.out.println("position " + n + " contains a special");
				isSpecial = true;
			} else {
				//System.out.println("Position " + n + " contains invalid char");
				//isInvalid = true;
				try {
					throw new InvalidCharacterExecption(password.substring(n,n+1));
				} catch (InvalidCharacterExecption e) {
					e.toString();
				}
			}				
			
		   }
		// Test & Exception Handling
			try {
				if (!isNumeric) { throw new NumberCriteriaExecption(password);} 
				if (!isAlphabet) { throw new LetterCriteriaExecption(password);}
				if (!isSpecial) { throw new SpecialCharCriteriaExecption(password);}
				else { System.out.println("Valid Password! ");}
			} catch (NumberCriteriaExecption | LetterCriteriaExecption | SpecialCharCriteriaExecption e) {
					System.out.println("Invalid password: " + e.toString());
				}
			}
			
		}
	}


class InvalidCharacterExecption extends Exception {
	String ch;
	public InvalidCharacterExecption(String ch) {
		this.ch = ch;
	} 
	public String toString() {
		return "InvalidCharacterException: " + ch;
	}
}	

class NumberCriteriaExecption extends Exception {
	String password;
	public NumberCriteriaExecption(String password) {
		this.password = password;
	} 
	public String toString() {
		return "NumberCriteriaExecption: " + password;
	}
}

class LetterCriteriaExecption extends Exception {
	String password;
	public LetterCriteriaExecption(String password) {
		this.password = password;
	} 
	public String toString() {
		return "LetterCriteriaExecption: " + password;
	}
}

class SpecialCharCriteriaExecption extends Exception {
	String password;
	public SpecialCharCriteriaExecption(String password) {
		this.password = password;
	} 
	public String toString() {
		return "SpecialCharCriteriaExecption: " + password;
	}
}
