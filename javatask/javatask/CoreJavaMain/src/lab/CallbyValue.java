package lab;

public class CallbyValue {
	
	public void show(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		CallbyValue b=new CallbyValue(); 
		b.show(10, 5);

	}

}
