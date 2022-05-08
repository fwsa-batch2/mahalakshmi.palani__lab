package com.String;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// toUpperCase,toLowerCase:
		String name = "Mahalakshmi";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name);
		
		//trim() method:
		// The String class trim() method eliminates white spaces before and after the String.
		String words = "	Hi I am Mahalakshmi		";
		System.out.println(words.trim());
		
		//startsWith(),endsWith():
		String s="Sachin";    
		System.out.println(s.startsWith("Sa"));//true    
		System.out.println(s.endsWith("m"));//true
		}
		 
}
