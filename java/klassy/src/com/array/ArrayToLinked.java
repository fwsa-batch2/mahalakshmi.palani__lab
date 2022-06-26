package com.array;
import java.util.*;
public class ArrayToLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(6);
		System.out.println("LinkedList"+list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list);
		System.out.println("ArrayList"+list2);
		
	}

}
