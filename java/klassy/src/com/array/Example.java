package com.array;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		B obj2 = new B();
		
		obj.start();
		obj2.start();
		
	}

}
class A extends Thread{

	public void run() {
		for(int i = 0; i<5;i++) {
			System.out.println("Hello "+ i);
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i = 0; i<5;i++) {
			System.out.println("Hi "+ i);
		}
	}
}

