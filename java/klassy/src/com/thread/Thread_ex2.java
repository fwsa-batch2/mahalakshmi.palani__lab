package com.thread;
import java.lang.Thread;

public class Thread_ex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		A obj1 = new A();
		//B obj2 = new B();
		Runnable b = new B();
		Thread obj2 = new Thread(b);
		obj1.start();
		obj2.start();
		if(obj1.isAlive()) {
			System.out.println("Still excuting");
		}
		
		obj1.join();
		obj2.join(); // print last
		if(obj1.isAlive()) {
			System.out.println("Still excuting");
		}
		System.out.println("finished");
		
	}

}
class A extends Thread{
	public void run() {
		for(int i = 0; i<5;i++) {
			System.out.println("first thread"+i);
			
		}
	}
}
class B implements Runnable{
	public void run() {
		for(int i = 0; i<5;i++) {
			System.out.println("second thread"+i);
			
		}
	}
}

