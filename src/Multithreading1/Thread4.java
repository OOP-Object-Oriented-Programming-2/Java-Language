package Multithreading1;

class Printer {
	synchronized void printDocuments(int numOfCopies, String docName) {
		for (int i = 1; i <= numOfCopies; i++) {
			System.out.println(" Printing " + docName + " " + i);
		}
	}
}

class MyThread2 extends Thread {
	Printer pRef;

	MyThread2(Printer p) {
		pRef = p;
	}

	@Override
	public void run() {
        pRef.printDocuments(5, "Yafet's pdf222");
		}
}

class YourThread2 extends Thread {
	Printer pRef;

	public YourThread2(Printer p) {
		pRef = p;
	}

	@Override
	public void run() {
          pRef.printDocuments(5, "sara's pdf222");
     }

}

public class Thread4 {

	public static void main(String[] args) {

		System.out.println(">>>Application started222<<<<");

		Printer printer = new Printer();
		printer.printDocuments(5, "Hello pdf");

		MyThread2 mRef = new MyThread2(printer);
		YourThread2 mRef2 = new YourThread2(printer);

		mRef.start();
		mRef2.start();

		System.out.println(">>>Application Ended<<<<");
	}
}
