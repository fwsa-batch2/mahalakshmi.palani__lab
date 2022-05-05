package com.String;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; //normal variable
		Integer obj1 = new Integer(a); // Boxing // old version
		Integer obj2 = Integer.valueOf(a); // old version
		Integer obj3 = a; // auto-Boxing // new version
		System.out.println(obj2);
		
		Integer obj4 = new Integer(15);  // unboxing  old version
		Integer obj5 = 10;
		int i = obj5.intValue(); // old version
		int j = obj5; //auto-unboxing
		System.out.println(j);
		
	}

}
