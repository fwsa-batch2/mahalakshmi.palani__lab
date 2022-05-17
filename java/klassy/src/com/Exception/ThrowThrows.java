package com.Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();

	}
	public static void method() throws IOException {  
		  
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
        String st;
		while ((st = fileInput.readLine()) != null) {
			 
            // Print the string
            System.out.println(st);
          
		}
        
        //throw new FileNotFoundException();  

	}
}
class Main {
	  static void checkAge(int age) {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	      //throw new ArithmeticException();
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }

	  public static void main(String[] args) {
	    checkAge(15); // Set age to 15 (which is below 18...)
	  }
	}
