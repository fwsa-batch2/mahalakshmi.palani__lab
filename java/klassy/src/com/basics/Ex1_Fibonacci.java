package com.basics;

import java.util.Scanner;

public class Ex1_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number :");
		int s1 = input.nextInt();

		int n1 = 0;
		int n2 = 1;
		
		System.out.print(n1+"  ");
		System.out.print(n2+"  ");
		
		
		for(int i = 2; i < s1; i++) {
			int n3 = n1+n2;
			System.out.print(n3+"  ");
			n1 = n2;
			n2 = n3;
		}
		
		

	}

}
