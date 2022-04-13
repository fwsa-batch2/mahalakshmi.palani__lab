package com.maha;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Eneter a Number:");
		int number = input.nextInt();
		int num1 = 1;
//		System.out.println("Factorial");
        for(int i = number; i >=1 ;i--){
        	System.out.println(i);
            num1 = num1*i;
        }
        System.out.println(num1);
	}

}
