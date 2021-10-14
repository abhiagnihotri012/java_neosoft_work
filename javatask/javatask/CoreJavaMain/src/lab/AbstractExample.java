package lab;

abstract class A3 {
	abstract void callme();

	void callmetoo() {
		System.out.println("This is a concrete method .");
	}
}

class B3 extends A3 {
	void callme() {
		System.out.println("B’ s implementation of callme.");
	}
}


public class AbstractExample {

	public static void main(String[] args) {
		 B3 b = new B3(); 
		 b.callme(); 
		 b.callmetoo();

	}

}
