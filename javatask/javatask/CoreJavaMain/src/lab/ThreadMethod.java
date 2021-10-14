package lab;

public class ThreadMethod {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("current thread:" + t);
		System.out.println("Name of the current thread:" + t.getName());
		System.out.println("Priority :" + t.getPriority());
		t.setName("mythread");
		System.out.println("after name change :" + t);
		t.setPriority(2);
		System.out.println("after priority change :" + t);

		System.out.println("number of active thread :" + t.activeCount());

	}

}
