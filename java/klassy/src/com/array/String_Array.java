package com.array;

import java.util.Arrays;

import java.util.List;
public class String_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  instruments = {"cello","guitar","violin","veena","piano"}; 
		List<String> myList = Arrays.asList("cello","guitar","violin","veena","piano");
		System.out.println(myList);
		String[] output = new String[instruments.length];
		
		for(int i = 0;i<instruments.length;i++) {
			String empty = "";
			for(int j =0;j<instruments[i].length();j++) {
				 if((instruments[i].charAt(j)!= 'a') && (instruments[i].charAt(j)!= 'e') 
&&(instruments[i].charAt(j)!= 'i')&&(instruments[i].charAt(j)!= 'o')&&(instruments[i].charAt(j)!= 'u')) {
					 char temp = instruments[i].charAt(j);
					 empty += temp;
				 }
						
			}
			output[i] = empty;
		}
		System.out.println(Arrays.toString(output));
	}

}
