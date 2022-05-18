package com.io;
import java.io.*;
public class FolderCreating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\klassyrestaurantapp-ui\\maha");
		boolean a = file.exists();
		System.out.println(a);
		
		if(a == false) {
			file.mkdir();
		}
		a = file.exists();
		System.out.println(a);
	}

}
class SubFolder{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\klassyrestaurantapp-ui\\maha\\lakshmi\\ragavi");
		boolean a = file.exists();
		System.out.println(a);
		
		if(a == false) {
			file.mkdirs();
		}
		a = file.exists();
		System.out.println(a);
	}
}
