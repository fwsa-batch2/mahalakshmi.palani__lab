package com.maha;
import java.util.Scanner;
public class scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// reading from a string:
		String myinput = "Hi I am Mahalakshmi I am studying fwsa";
		Scanner input = new Scanner(myinput).useDelimiter("Ma");
		
		while(input.hasNext()) {
			System.out.println(input.next());
		}
		
		// difference between next and nextLine methods:
		
		Scanner diff = new Scanner(System.in);
//		System.out.println("enter a value = "+ diff.next());
		System.out.println("enter a value = "+ diff.nextLine());
	}
	
	

}
