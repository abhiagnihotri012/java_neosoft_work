package lab;

public class OverridindExDemo {

	void test() {
		System.out.println("No parameters");
	}

	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	void test(double a) {
		System.out.println("Inside test (double) a : " + a);
	}

	public static void main(String[] args) {
		OverridindExDemo ob = new OverridindExDemo(); 
		 ob.test(); 
		 ob.test(5); 
		 ob.test(10,20); 
		 ob.test(23,56); 

	}

}
