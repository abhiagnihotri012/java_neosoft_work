package lab;

public class Inventory {

	static int qoh = 500;
	static int req = 0;

	static public synchronized void request(int order) {
		if (order <= qoh) {
			System.out.println("Quantity ordered :" + order);
			qoh -= order;
			req += order;
			System.out.println("Quantity on hand :" + qoh);
			System.out.println("Total quantify taken away by way of order :" + req);
		} else {
			System.out.println("Ordered quantity more than quantity  on hand");
		}
	}

	public static void main(String args[]) {
		new OurThread();
		new OurThread();
		try {
			for (int p = 3; p > 0; p--) {
				System.out.println("======================");
				System.out.println(" main thread :" + p);
				System.out.println("======================");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}

		System.out.println(" exiting main thread . ..");
	}
}

class OurThread extends Thread {
	OurThread() {
		super("test thread");
		System.out.println("child thread :" + this);
		start();
	}

	public void run() {
		for (int i = 5; i > 0; i--) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
			}

			Inventory.request((int) (Math.random() * 100));
		}
	}

}
