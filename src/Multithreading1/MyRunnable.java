package Multithreading1;

class MyRunnable implements Runnable {
	
	private String name;
	private int id;

	public MyRunnable(String n, int i) {
		this.name = n;
		this.id = i;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(this.name + " " + this.id);
			try {
				if (this.id == 1) {
					Thread.sleep(2000);
					
				} else if (this.id == 2) {
					Thread.sleep(1000);
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		

	}
	
	public static void main(String[] args) {

		MyRunnable myRunnable = new MyRunnable("Yafet", 1);
		Thread t1 = new Thread(myRunnable);
		t1.start();

		MyRunnable myRunnable2 = new MyRunnable("Blein", 2);
		Thread t2 = new Thread(myRunnable2);
		t2.start();
	}

}
