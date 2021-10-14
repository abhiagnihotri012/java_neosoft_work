package lab;

public class StaticTest {
	static int b=12;
	static void show() {
		System.out.println("static show");
	}
	static{
		System.out.println("static block");
	}
	void display() {
		System.out.println("Not a static method");
	}

	public static void main(String[] args) {
		StaticTest obj=new StaticTest();
		int a=10;
		StaticTest.show();
		System.out.println(StaticTest.b);
		System.out.println(a);
		
		

	}

}
