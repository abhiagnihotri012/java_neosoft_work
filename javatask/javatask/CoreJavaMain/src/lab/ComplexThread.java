package lab;

public class ComplexThread extends Thread {

	private int delay;

	ComplexThread(String name, float seconds) {
		super(name);
		delay = (int) seconds * 1000;// delays are in milliseconds
		start(); // start up ourself!
	}

	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

	public static void main(String argc[]) {

		new ComplexThread("one potato", 1.1F);
		new ComplexThread("two potato", 1.3F);
		new ComplexThread("three potato", 0.5F);
		new ComplexThread("four", 0.7F);
	}

}
