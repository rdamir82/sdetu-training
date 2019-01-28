package com.imtiaz.learningfilereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("C:\\1Users\\korisnik\\eclipse-workspace\\JavaTraining\\src\\filesProcessing\\myfile");
		BufferedReader bufferedReader = null;
		
		try {
			
			FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			
			String line = bufferedReader.readLine();
			
			while(line != null){
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		
		} catch (IOException e) {
			
			System.out.println("Problem reading the file " + file.getName());
			
		} finally {
		
			try {
				bufferedReader.close();
			} catch (IOException e) {
				
				System.out.println("unable to close fail " + file.getName());
			
		}	

	}

  }
}
