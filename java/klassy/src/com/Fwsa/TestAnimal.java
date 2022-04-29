package com.Fwsa;
abstract class Animal{			//Abstract class
											
	  public abstract void animalSound();		// Abstract method (does not have a body)
	 
	  public void sleep() {
	    System.out.println("Zzz");		 // Regular method
	  }
	  
}
class Pig extends Animal {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
	  }
}  
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig myobj = new Pig();
		myobj.animalSound();
		myobj.sleep();
	}

}
