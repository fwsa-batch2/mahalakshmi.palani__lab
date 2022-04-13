package com.maha;
import java.lang.*;

public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int sum = add(10,2);
	    int sub = subration(22,12);
	    double s = square(2);
	    System.out.println("Addition = "+ sum);
	    System.out.println("subration = "+ sub);
	    System.out.println("square = "+ s);
	   
	}
	public static int add(int num1,int num2) {
		int sum = num1+num2;
		return sum;
	}
	public static double square(int num) {
		double s = Math.sqrt(num);
		return s;
	}
	public static int subration(int num1,int num2) {
		int sub = num1-num2;
		return sub;
	}
}
