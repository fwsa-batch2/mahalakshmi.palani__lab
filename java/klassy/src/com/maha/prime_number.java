package com.maha;
import java.util.Scanner;
public class prime_number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is a prime number.");
		} 
		else {
			System.out.println(n + " is not a prime number.");
		}
	}
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		System.out.println(Math.sqrt(n));
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}