package com.basics;
import java.util.*;
public class ReverseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = "Maha lakshmi".split(" ");
		String first = "";
		for (int i = name.length-1; i>=0; i--) {
			first += name[i] + " ";
		}
		System.out.println(first);
	}
	
	
	
     
}
