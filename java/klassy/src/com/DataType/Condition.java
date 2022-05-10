package DataType;

import java.util.Scanner;

/*1. Given an integer ,n , perform the following conditional actions:
 If n is odd, print Weird
 If is even and in the inclusive range of 2 to 5 , print Not Weird 
 If n is even and in the inclusive range of 6 to 20, print Weird
 If n is even and greater than 20, print Not Weird 
In this challenge, you must read an integer, a double, and a String from stdin, then 
print the values according to the instructions in the Output Format section below.*/
public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer :");
		int num = input.nextInt();
		
		if(num%2 == 0) {
			if(num>= 2 && num <= 5) {
				System.out.println("Not Weird");
			}
			else if(num >=6 && num<=20) {
				System.out.println("Weird");
			}
			else if(num<20) {
				System.out.println("Not Weird");
			}
			
		}
		else {
			System.out.println("Weird");
		}
		String str = printHello();
	}
	
	public static String printHello() {
		return new String("Hello..!");
	}
}



