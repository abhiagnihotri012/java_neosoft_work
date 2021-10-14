package lab;

class A{
	int x=10;
	void m1() {
		System.out.println("Hii A");
	}
	A(){
		System.out.println("Constructor A");
	}
}

class B extends A{
	int x=5;
	void m2() {
		int x=2;
		System.out.println(this.x);
	}
	B(){super();
		System.out.println(x);
	}
	
}



public class ThisTest{
	
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
	}

}

