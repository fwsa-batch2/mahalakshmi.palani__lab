package com.basics;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = add(22,32);
		System.out.println(a);
		int b = 10;
		System.out.println(b++*b++);
		int c = 'a';
		System.out.print(c);
	}
	public static int add(int num1,int num2) {
		int result = num1+num2;
		return result;
	}
}
