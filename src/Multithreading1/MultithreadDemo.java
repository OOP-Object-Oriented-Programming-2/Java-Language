package Multithreading1;

 class MultithreadDemo1 extends Thread {

	public void run() {
		try {
	//displaying the thread that is running
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		
		}
		catch(Exception e) {
			// throwing exception
			System.out.println("Exception is cought");
		}
	}
 }
public class MultithreadDemo{
	
	public static void main(String[] args) {
		int n = 2;
		for(int i = 0; i <= n; i++) {
			MultithreadDemo1 object = new MultithreadDemo1();
			object.start();
				}
	}

	
}
