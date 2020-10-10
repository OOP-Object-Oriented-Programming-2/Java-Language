package Multithreading1;

public class YafetThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("" + Thread.currentThread().getName());
	}

	
	public static void main(String[] args) {
		 
		Thread yaf = new YafetThread();
				yaf.start();
		
		Thread yaf2 = new YafetThread();
		yaf2.start();
		
	}
}
