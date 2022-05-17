package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		// Read a File
		File file = new File("D:\\mahalakshmi.palani__lab\\java\\klassy\\java_io.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String output = "";
		String st;
		while ((st = br.readLine()) != null) {
			 
            // Print the string
            System.out.println(st);
            output += st;
		}
		
		
		// Write to a File
		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\mahalakshmi.palani__lab\\java\\klassy\\output.txt"));
		writer.write(output);
		writer.close();
		System.out.println("finished");
	}

}
