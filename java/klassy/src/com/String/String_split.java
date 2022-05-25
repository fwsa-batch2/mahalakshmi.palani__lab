
package com.String;

public class String_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java string, split method by javat?point"; 
		String s2 ="He is a very very good boy, isn't he?";
		
		//splits the string based on whitespace 
		//String[] words=s1.split("\\s");
		//String[] word=s1.split(" ");
		 /* Split on all non-alphabetic characters */
		String[] words = s2.split("[^a-zA-Z]+");
		 int len = words.length;
		 System.out.println(len);
		//using java foreach loop to print elements of string array  
		for(String w:words){  
			System.out.println(w); 
		}
	}

}
