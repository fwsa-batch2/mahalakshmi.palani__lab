package com.array;

import java.util.*;
// hackerrank 1dArray:
public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for(int i =0; i<a.length;i++){
            a[i]=scan.nextInt();
            
        }


        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
//class A{
//	 int add(int a, int b) {
//		return a+b;
//	}
//}
//class B extends A{
//	public static void main(String[] args) {
//		short s  = 9;
//		System.out.println(add(s,6));
//		}
//}