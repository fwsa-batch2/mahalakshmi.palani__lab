package com.maha;
// creating constructor:
public class Calculator {
	int num1;
	int num2;
	Calculator(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;      // 2 argument constructor;
		int sum = num1+num2;
		System.out.println(sum);
	}
	Calculator(int a){
		num1 = a;      // 1 argument constructor;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator add = new Calculator(22,45);
		Calculator add1 = new Calculator(6);
		//System.out.println(add.num1+""+add.num2);
	}

}
