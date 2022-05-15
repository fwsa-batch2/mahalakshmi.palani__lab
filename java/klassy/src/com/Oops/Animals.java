package com.Oops;
// inheritance i'm used instanceof operator:
public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Mammal extends Animals{}

class Reptile extends Animals{}

class Dog extends Mammal{
	public static void main(String[] args) {
		Animals a = new Animals();
		Mammal m = new Mammal();
		Dog d = new Dog();
		
		System.out.println(m instanceof Animals);
		System.out.println(d instanceof Mammal);     // Ans is true
		System.out.println(d instanceof Animals);
		
		
	}
	
}

