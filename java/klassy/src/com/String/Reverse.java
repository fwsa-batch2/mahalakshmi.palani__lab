package com.String;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mahalakshmi";
		int len = name.length();
		//System.out.println(len);
		for(int i = len-1; i>=0;i--) {
			System.out.println(name.charAt(i));
			//System.out.println(i);
		}
	}

}
