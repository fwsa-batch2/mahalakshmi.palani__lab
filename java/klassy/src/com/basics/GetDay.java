package com.basics;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;
public class GetDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();  
		//creating a constructor of the SimpleDateFormat class  
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
		//getting current date  
		System.out.println("Today's date: "+sdf.format(cal.getTime()));
		Format f = new SimpleDateFormat("EEEE");  
		String str = f.format(new Date()); 
		//prints day name  
		System.out.println("Day Name: "+str);
	}

}
