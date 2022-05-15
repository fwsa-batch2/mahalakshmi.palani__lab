package com.Oops;
class A{
	int x;
	A(){
		x = 100;
	}
	A(int x){
		this.x = x;
	}
	 public int area() {
		return 1;
		
	}
	protected double perimeter() {
		return 0;
	}
	
}
public class B extends A {
	int x; // name hiding variable
	int y; // instance variable of B
	int side;
	B(){
		x = 342;
	}
	B(int side){
		this.side = side;
	}
	public int getValue() {
		return super.x;
	}
	public int area() {
		return side*side;  // method overridden
	}
	 protected double perimeter() {
		 return 4.0*side;
	 }
	 public void print() {
		 System.out.println("Area = "+this.area()+" Perimeter = "+this.perimeter());
	 }
	 public void getArea() {
		 super.area();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B myObj = new B();
		B myObj2 = new B(200);
		System.out.println(myObj.x);
		System.out.println(myObj.y);
		System.out.println(myObj.getValue());
		myObj2.print();
		myObj2.getArea();
	}

}

