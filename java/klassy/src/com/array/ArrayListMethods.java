package com.array;

import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(23);
		list1.add(2);
		list1.add(25);
		list1.add(10);
		Collections.sort(list1);
		System.out.println(list1);
		list1.remove(2);
		System.out.println(list1);
		// isEmpty method
		System.out.println("Is ArrayList Empty: "+list1.isEmpty());   
		// length of Array list:
		System.out.println("ArrayList Length "+list1.size());
	}

}
class SortArrayList{
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("naveena");
		list.add("nathiya");
		list.add("anitha");
		list.add("maha");
		  //Sorting the list  
		Collections.sort(list);
		System.out.println(list);
	}
}
