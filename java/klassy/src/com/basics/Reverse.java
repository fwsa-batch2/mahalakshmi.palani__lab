package com.basics;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter above 1 digit number");
		int num1 = input.nextInt();
		int len = String.valueOf(num1).length();
		for(int i = len; i > 0; i--) {
			int a = num1%10;
			System.out.print(a);
			num1 = num1/10;

		}
		
		
		
	}

}
