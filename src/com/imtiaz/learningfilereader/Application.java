package com.imtiaz.learningfilereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\korisnik\\eclipse-workspace\\JavaTraining\\src\\filesProcessing\\myfile");
		
		try (FileReader fileReader = new FileReader(file);
			 BufferedReader bufferedReader = new BufferedReader(fileReader);	) {
			
		//	fileReader = new FileReader(file);
		//	bufferedReader = new BufferedReader(fileReader);
			
			
			String line = bufferedReader.readLine();
			
			while(line != null){
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		
		} catch (IOException e) {
			
			System.out.println("Problem reading the file " + file.getName());
			
		} 
	/*	
		finally {
		
			try {
				if(bufferedReader != null) {
					bufferedReader.close();	
				}
				if(fileReader != null) {
				fileReader.close();
				}
			} catch (IOException e) {
				
				System.out.println("unable to close fail " + file.getName());
			
		    }	

	}
	*/

  }
}
