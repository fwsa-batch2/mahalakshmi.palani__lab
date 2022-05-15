package com.array;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> set= new HashSet<>();
		set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        set.add("Three"); 
        System.out.println(set.contains("One"));  
        set.remove("Five");
        set.clear();
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
//        HashSet <Integer> set2= new HashSet<>();
//        set2.add(1);    
//        set2.add(2);    
//        set2.add(3);   
//        set2.add(4);  
//        set2.add(5);  
        
        
      //  System.out.println(set2);
        HashSet <String> set3= new HashSet<>();
        set3.add("seven");  
        set3.add("eight");
        set.addAll(set3); // union
        System.out.println("union of 2 sets: "+set); 
	}

}
class HashSet2{
	public static void main(String[] args) {
		HashSet <String> set= new HashSet<>();
		set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        set.add("Three"); 
	}
}
