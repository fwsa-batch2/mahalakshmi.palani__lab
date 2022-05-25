package com.thread;

public class Synchr_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		Thread t1 = new Thread() {
			public void run() {
				t.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				t.printTable(5);
			}
		};
		
	}

}
class Table{
	void printTable(int num) {
		for(int i = 0; i<5;i++) {
			System.out.println(i*num);
			
		}
	}
}