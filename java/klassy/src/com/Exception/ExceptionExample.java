package com.Exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = 5/2;
			int num2 = 23/0;
			System.out.println(num);
			System.out.println(num2);
			String s = null;
			System.out.println(s.length());
			
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {  
			System.out.println("finally block is always executed");  
			}  
		
	}

}
