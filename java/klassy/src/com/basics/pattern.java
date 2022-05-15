package com.basics;

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
//class pattern2{
//	public static void main(String[] args) {
//		int n = 6;
//		int i;
//		 for (i=0; i<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
//         { 
//             System.out.print(" "); //print space
//         }  
//         for (int j=0; j<=i; j++ ) //inner loop for number of columns
//         { 
//             System.out.print("* "); //print star
//         } 
//
//         System.out.println(); //ending line after each row
//     } 
//		
//		
//}

