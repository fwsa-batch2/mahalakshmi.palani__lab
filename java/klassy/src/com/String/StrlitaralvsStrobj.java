package com.String;

public class StrlitaralvsStrobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello"; // string litaral
		String s2 = "hello";
		String s3 = s2;
		System.out.println(s1 == s2); // string object
	//	System.out.println(s1 == s3);
		String s4 = new String("abc");
		String s5 = new String("abc");
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
		System.out.println(100+100+"abc");
	}

}

