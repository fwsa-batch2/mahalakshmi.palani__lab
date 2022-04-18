package com.maha;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner input = new Scanner(System.in);
	        System.out.println("Eneter a Number:");
	        int num1 = input.nextInt();
	        System.out.println("Orginalnum = "+num1);
	        int len = (Integer.toString(num1)).length();
	        int temp = num1;
	        int sum =0;
	        while(temp !=0) {
	        	int num2 = temp%10;
	        	sum += (Math.pow(num2,len));
	        	temp = temp/10;
	        	
	        }
	        System.out.println("Armstrongnum  = "+sum);
	        
	        if(sum == num1) {
	        	System.out.println(sum +"  this number is Armstrong number");
	        }
	        else {
	        	System.out.println(sum+"  this number is Not an Armstrong number");
	        }
	        
		}
	
}

