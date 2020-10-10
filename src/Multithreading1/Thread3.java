package Multithreading1;

class Printer {
  void printDocuments(int numOfCopies, String docName) {
		for(int i=1; i<=numOfCopies; i++) {
			System.out.println("Printing " + docName +" "+ i );
		}
	}
}

class MyThread extends Thread{
	Printer pRef;
	
	MyThread(Printer p){
		pRef=p;
	}
	
	@Override
	public void run() {
		 //(pRef) {
		pRef.printDocuments(5, "Sara's Profile.pdf");
		//}
	}
}

class YourThread extends Thread{
	Printer pRef;
	
	YourThread(Printer p){
		pRef=p;
	}
	
	@Override
	public void run() {
		// (pRef) {
		pRef.printDocuments(5, "Yared's Profile.pdf");
		//}
	}
}

public class Thread3 {
	public static void main(String[] args) {
   
		System.out.println("===Application Started==");
		
		//We have here only 1 single object of printer
		Printer printer = new Printer();
		printer.printDocuments(5, "Yafet's Profile.pdf");
		
		
		//Senario is multiple thread working on the same Printer object
		//If Multiple Threads are going to work on the same object,we must Synchronize them
		//So we must put JOIN() after START() to resolve this 
		//Printer is now going to be shared b/n two objects
		//MyThread is having reference to the printer object
		//YourThread is having reference to the printer object
		MyThread mRef = new MyThread(printer);
		YourThread mRef2 = new YourThread(printer);
		
		//so the o/p is mixed up. ( like two people need to print the paper 
		//which is called Asynchronization 
		
		mRef.start();
		try {
			mRef.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			mRef.join();              //So instead of writting this block under every block,
		} catch (InterruptedException e) { // we will add synchronization in our class.
			e.printStackTrace();
		}*/
		mRef2.start();
  
		System.out.println("===Application Ended===");
		

	}
}
