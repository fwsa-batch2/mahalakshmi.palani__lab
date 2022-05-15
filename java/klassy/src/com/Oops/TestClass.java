package com.Oops;

public class TestClass {		// super class
	
	int a = 5;
	public int b = 10;				
	protected int c = 15;
	private int d = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass myObj1 = new TestClass();
		System.out.println("default"+myObj1.a);
		System.out.println("public"+myObj1.b );
		System.out.println("protected"+myObj1.c);
		System.out.println("private"+myObj1.d );
	}

}
class Add extends TestClass{		//sub class
	public static void main(String[] args) {
		Add myObj2 = new Add();
		System.out.println("default"+myObj2.a);
		System.out.println("public"+myObj2.b );
		System.out.println("protected"+myObj2.c);
		//System.out.println("private"+myObj2.d );
	}
}
class Mul {			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass myObj3 = new TestClass();
		System.out.println("default"+myObj3.a);
		System.out.println("public"+myObj3.b );
		System.out.println("protected"+myObj3.c);
		//System.out.println("private"+myObj2.d );
		

	}
}