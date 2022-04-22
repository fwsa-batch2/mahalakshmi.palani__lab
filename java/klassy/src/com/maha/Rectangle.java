package com.maha;

public class Rectangle {
	int length;
	int breadth;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Zero argument constructor
		Rectangle myObj = new Rectangle();
		System.out.println("length : " + myObj.length+" , breath "+myObj.breadth );
		
	}
	Rectangle(){
		System.out.println("Zero argument constructor called..");
		length = 40;
		breadth = 50;
		
	}

}
