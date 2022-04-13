package com.maha;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	System.out.println("Enter your value : ");
	        Scanner in = new Scanner(System.in);
	        int number = in.nextInt();
	        int temp = number;
	        int d1,d2,d3;
	        d1 = temp%10;
	        temp = temp/10;
	        d2 = temp%10;
	        temp = temp/10;
	        d3 = temp%10;
	        temp=temp/10;
	        int result = (d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
	        if(number == result){
	            System.out.println(number+" is armstrong number");
	        }else{
	            System.out.println(number+" is not armstrong number");
	        }
		}
	
}

