package com.basics;

public class Static_Keyword {
	
	int a ;
	static int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Keyword obj1 = new Static_Keyword();
		Static_Keyword obj2 = new Static_Keyword();
		obj1.a=10;
		obj2.a=20;
		obj1.c=10;
		obj2.c=20;
		System.out.println(obj2.a);
		System.out.println(obj1.a);
		System.out.println(obj2.c);
		System.out.println(obj1.c);
	
	}

}
