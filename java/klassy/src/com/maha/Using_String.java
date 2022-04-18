package com.maha;

public class Using_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] word = {'H','e','l','l','o','W','o','r','l','d'};
		String str = new String(word);
		System.out.println(str);
		
		String newStr = new String(word,3,5); // starting,total index
		System.out.println(newStr);
	}

}
