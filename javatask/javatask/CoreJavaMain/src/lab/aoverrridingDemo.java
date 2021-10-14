package lab;

class A1{
	public void m1() {
		System.out.println("hello A");
	}
	
}

class B1 extends A1{
	public void m1() {
		System.out.println("hello B");
	}
	
}

public class aoverrridingDemo {

	public static void main(String[] args) {
		B1 b=new B1();
		b.m1();
		A1 a=new A1();
		a.m1();

	}

}
