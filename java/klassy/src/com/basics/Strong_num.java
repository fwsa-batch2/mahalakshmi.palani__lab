package com.basics;
import java.util.Scanner;
public class Strong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num1 = input.nextInt();
		System.out.println("original number : "+ num1);
		int temp = num1;
		int sum = 0;
		
		int i = 1;
		while(temp != 0 ) {
			int num2 = temp%10;
			int f = 1;
			for(i = 1; i <= num2;i++) {
				 f = f*i;
				 //i++;
				 //System.out.println(i);
				 
			}
			 sum = sum+f;
			 System.out.println(sum);
			 temp = temp/10;
		}
		 System.out.println("Strongnum  = "+sum);
	        
		 if(sum == num1) {
		    System.out.println(sum +"  this number is strong number");
		  }
		 else {
		    System.out.println(sum+"  this number is Not an strong number");
		 }
		
		
	}

}
