package com.io;

import java.io.File;
import java.io.IOException;

public class FileCreating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\klassyrestaurantapp-ui\\maha\\test.txt");
		boolean a = file.exists();
		System.out.println(a);
		if(a == false) {
			try {
				boolean creating = file.createNewFile();
				System.out.println("new file creating  "+creating);
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
	}

}
class FileDeleting{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\klassyrestaurantapp-ui\\maha\\test.txt");
		file.delete();
		boolean a = file.exists();
		System.out.println(a);
		
		
	}
}
class FileRename{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\klassyrestaurantapp-ui\\maha\\test.txt");
		file.createNewFile();
		File newFile = new File("D:\\\\klassyrestaurantapp-ui\\\\maha\\\\mytest.txt");
		boolean rename = file.renameTo(newFile);
		System.out.println(rename);
	}
}
