package com.maha;
// inheritance: Single
class Employee{  
	 float salary=40000;  
	 public String Ename(String name) {
		return name; 
	 }
	 
} 

class Programmer extends Employee{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   String Name = p.Ename("Maha");
	   System.out.println(p.Ename("Lakshmi"));
	   System.out.println(Name);
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
}  
