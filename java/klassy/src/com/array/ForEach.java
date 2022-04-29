package com.array;
//foreach loop:
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] word = {'h','e','l','l','o'};
		for(char data:word) {
			System.out.println(data);
		}
	}

}
class basics{
	public static void main(String[] args) {
		//creating array:
		char[] vowel = new char[5];
		// add element in array:
		vowel[0] = 'a';
		vowel[1] = 'e';
		vowel[2] = 'i';
		vowel[3] = 'o';
		vowel[4] = 'u';
		System.out.println(vowel);
		
		
	}
}