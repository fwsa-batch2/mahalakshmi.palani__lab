package com.maha;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<5;i++) {
			for(int j = i; j >0; j--) {
				System.out.print("*");
				System.out.print("");
			}
			System.out.println("");
		}
		for(int i = 5; i>0;i--) {
			for(int j = i; j >0; j--) {
				System.out.print("*");
				System.out.print("");
			}
			System.out.println("");
		}
	}

}
class pattern2{
	public static void main(String[] args) {
		for(int i = 5; i>0;i--) {
			for(int j =i;j>0;j--) {
				System.out.print("");
				
			}
			//System.out.println("");
			for(int k = 1; k<6;k++) {
				
				System.out.println("*");
			}
		}
	
		
	}
}
