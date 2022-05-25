package com.thread;

public class example extends Thread{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Task t1 = new Task("Task1");
		Task t2 = new Task("Task2");
		Task t3 = new Task("Task3");
		t1.start();
		t2.start();
		t3.start();
		
		
		//System.out.println("Task Finished...");
	}
}

class Task extends Thread{  
	String name;
	public Task(String name) {
		this.name = name;
	}
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(name + " printing " + i);
		}
	}
}

