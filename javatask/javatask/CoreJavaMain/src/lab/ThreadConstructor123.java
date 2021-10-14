package lab;

public class ThreadConstructor123 extends Thread {
	
	
	public static void main(String args[]) {
		new ThreadConstructor123();
		try {
			for (int k = 5; k < 0; k--) {
				System.out.println("Running main thread :" + k);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
		System.out.println("Exiting main thread . . .");
	}

	ThreadConstructor123() {
		super("Using Thread class");
		System.out.println("Child thread:" + this);

		start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child thread" + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
		}
		System.out.println("exiting child thread …");
		
	
	}
}


