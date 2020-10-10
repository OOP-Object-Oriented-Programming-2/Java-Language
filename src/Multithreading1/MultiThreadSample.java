  package Multithreading1;

public class MultiThreadSample {

	int arrlist[] = {3,6,2,4,6,5};
	static int result1 = 0;
	static int result2 = 0;

	
	static Thread t1 = new Thread(){
		public void run(){
		
		System.out.println("Thread 1 is executing");
		result1 =  sum(3,4);
    	
		}};
		
	static Thread t2 = new Thread(){
		public void run(){
			
		System.out.println("Thread 2 is executing");
		result2 = sum(3,4);
	    	
		}};
		
	public static int sum(int a , int b  ) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		t1.start();
		t2.start();
		 while (Thread.activeCount() > 1) {
	     }
		 
		 System.out.println(result1);
		 System.out.println(result2);
		 
		 System.out.println(result1+result2);
		 
		 
	}



}
