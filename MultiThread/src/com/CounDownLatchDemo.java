package com;

import java.util.concurrent.CountDownLatch;

public class CounDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch=new CountDownLatch(4);
		Worker w1=new Worker(1000, latch, "Worker - 1");
		Worker w2=new Worker(3000, latch, "Worker - 2");
		Worker w3=new Worker(4000, latch, "Worker - 3");
		Worker w4=new Worker(6000, latch, "Worker - 4");
		
		w1.start();
		w2.start();
		w3.start();
		w4.start();
		System.out.println("Main Thread finish");
		latch.await();
		
		System.out.println("Main Thread finish");
	}

}
 class Worker extends Thread{
	 private int delay;
	 private CountDownLatch latch;
	 
	public Worker(int delay, CountDownLatch latch,String name) {
		super(name);
		this.delay = delay;
		this.latch = latch;
	}
	 
	public void run(){
		
		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName()+ "Current Thread Fin");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
 }