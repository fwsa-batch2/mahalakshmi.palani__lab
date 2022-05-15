package com.Oops;
class Encapsulation{
	private int AccNo;
	private String UserName;
	
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int AccNo) {
		 this.AccNo = AccNo;
	}
	public String getName() {
		return UserName;
	}
	public void setName(String UserName) {
		 this.UserName = UserName;
	}
	
}
public class UserData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
		Encapsulation myObj = new Encapsulation();
		myObj.setAccNo(123456);
		myObj.setName("Mahalakshmi");
		System.out.println("Account number = "+myObj.getAccNo());
		System.out.println("User Name = "+myObj.getName());
		
		
		
		
	}

}
