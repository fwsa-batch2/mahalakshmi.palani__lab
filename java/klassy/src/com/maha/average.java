package com.maha;
import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter Tamil mark :");
		int s1 = input.nextInt();
		System.out.println("enter English mark :");
		int s2 = input.nextInt();
		System.out.println("enter Science mark :");
		int s3 = input.nextInt();
		System.out.println("enter Maths mark :");
		int s4 = input.nextInt();
		System.out.println("enter Social mark :");
		int s5 = input.nextInt();
		
		float avg = s1+s2+s3+s4+s5/5;
		System.out.println("average :"+ avg);
		
		
	}

}
