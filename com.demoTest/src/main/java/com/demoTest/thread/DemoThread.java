package com.demoTest.thread;

 class CounterTest {
	Object obj=new Object();
	int count;
	public  void increment(){
		synchronized(obj){
			count++;
		}
		
	}
}
public class DemoThread{
public static void main(String[] args) throws InterruptedException {
	CounterTest dt=new CounterTest();
	
	Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				dt.increment();
			}
		
			
		}
	});
	
	Runnable task2=()->{for (int i = 0; i < 1000; i++) {dt.increment();	}};
Thread t2=new Thread(task2);
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println(dt.count);
}
}
