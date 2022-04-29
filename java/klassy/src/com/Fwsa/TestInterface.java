package com.Fwsa;
interface Bank{    // interface class
		float rateOfInterest();  
	}  
class SBI implements Bank{  
		public float rateOfInterest(){return 9.15f;}  
}  
class PNB implements Bank{  
		public float rateOfInterest(){return 9.7f;}  
}  


public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI a=new SBI(); 
		PNB b=new PNB();
		System.out.println("ROI: "+b.rateOfInterest());
		System.out.println("ROI: "+a.rateOfInterest());
		
	}

}
	 
	 

