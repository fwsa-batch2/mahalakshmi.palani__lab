package com.maha;

import java.util.Scanner;

public class Perfect_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		int sum =0;
		System.out.println("original number : "+ num);
		int i;
		for( i = 1; i < num; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		if(sum == num) {
		    System.out.println(sum +"  this number is perfect number");
		  }
		 else {
		    System.out.println(sum+"  this number is Not an perfect number");
		 }
	}

}
