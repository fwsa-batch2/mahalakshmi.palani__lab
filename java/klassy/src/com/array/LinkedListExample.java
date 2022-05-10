package com.array;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("maha");
		list.add("lakshmi");
		list.add("ragavi");
		list.add("pavi");
		//System.out.println(list);
		list.addFirst("hello");
		//System.out.println(list);
		list.addLast("world");
		//System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}

}
