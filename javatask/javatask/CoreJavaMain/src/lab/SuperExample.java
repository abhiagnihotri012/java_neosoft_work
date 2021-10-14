package lab;

class A2{
	int x=20;
	A2(){
		System.out.println("Heloo parent");
		
	}
}

class B2 extends A2{
	int x=10;
	B2(){super();
		System.out.println("Hello child");
		System.out.println(super.x);
		System.out.println(x);
	}
}

public class SuperExample {

	public static void main(String[] args) {
		A2 a=new A2();
		B2 b=new B2();

	}

}
