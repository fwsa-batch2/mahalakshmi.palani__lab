package com.DataType;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 145;
		int num2 = 145;
		int sum =0;
		
		while(num !=0) {
			int strong = 1;
			int temp = num%10;
			for(int i =1; i<=temp;i++) {
				strong = strong*i;
			}
			sum += strong;
			num =num/10;
		}
		System.out.println(sum);
		if(num2 == sum) {
			System.out.println("this number is strong");
		}
		else {
			System.out.println("this number is not strong");
		}
	}

}
