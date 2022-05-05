package com.String;

public class StringBufferNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer Myobj1 = new StringBuffer("Hello");
		System.out.println(Myobj1.append("world"));
		StringBuffer Myobj2 = new StringBuffer("java");
		System.out.println(Myobj2.insert(2,"programmer"));
		StringBuffer Myobj3 = new StringBuffer("maha");
		System.out.println(Myobj3.replace(1,2,"programmer"));
		StringBuffer Myobj4 = new StringBuffer("mahalakshmi");
		System.out.println(Myobj4.delete(1,4));
		StringBuffer Myobj5 = new StringBuffer("mahalakshmi");
		System.out.println(Myobj5.reverse());
		
	}

}
