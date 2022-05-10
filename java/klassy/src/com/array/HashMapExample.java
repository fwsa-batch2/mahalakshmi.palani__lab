package com.array;
import java.util.HashMap; // import the HashMap class

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		 	capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println(capitalCities);
		    System.out.println(capitalCities.keySet());
		    System.out.println(capitalCities.values());
		    System.out.println(capitalCities.entrySet());
		    System.out.println(capitalCities.get("England"));
		    capitalCities.remove("England");
		    System.out.println(capitalCities);
		    capitalCities.clear();
		    System.out.println(capitalCities);
		    System.out.println(capitalCities.size());
		    
		    
	}

}
