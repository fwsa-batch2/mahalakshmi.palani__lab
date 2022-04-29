package com.maha;
import com.Fwsa.*;
import java.lang.*;
// Methods creation:
public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 =  add(10,2);
	    int sum2 = add(12,2);
	    int sub = subration(22,12);
	    double s = sqrt(2);
	    int d = divition(4,2);
	    int m = multiple(43,12);
	    System.out.println("Addition = "+ sum1);
	    System.out.println("Addition = "+ sum2);
	    System.out.println("subration = "+ sub);
	    System.out.println("square = "+ s);
	    System.out.println("divition = "+ d);
	    System.out.println("multiple = "+ m);
	  
	   
	}
	
	public static int add(int num1,int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	public static int divition(int num1, int num2) {
		int d =  num1/num2;
		return d;
	}
	public static int multiple(int num1,int num2) {
		int m = num1*num2;
		return m;
	}
	public static double sqrt(int num) {
		double s = Math.sqrt(num);
		return s;
	}
	public static int subration(int num1,int num2) {
		int sub = num1-num2;
		return sub;
	}
}
// encapsulation connected with Fwsa package:

class div extends TestClass{
	public static void main(String[] args) {
		div myObj = new div();
		//System.out.println("default"+myObj.a);
		System.out.println("public"+myObj.b);
		System.out.println("protected"+myObj.c);
		//System.out.println("private"+myObj.d );
		
	}
}