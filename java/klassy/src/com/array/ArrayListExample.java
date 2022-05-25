package com.array;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("maha");
		list.add("lakshmi");
		list.add("ragavi");
		list.add("pavi");
		System.out.println(list);
		
		Iterator itr=list.iterator();//getting the Iterator  
		while(itr.hasNext()){//check if iterator has the elements  
		   System.out.println(itr.next());//printing the element and move to next  
		 } 
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("banana");
		list1.add("grapes");
		list1.add("mango");
		
		// get method:
		System.out.println("Returning element: "+list1.get(1));
		
		// set method
		list1.set(1, "orange");
		//ArrayList with the for-each
		for(String fruit:list1) {   
		    System.out.println(fruit);    
		  
		 }  
		
	}

}
