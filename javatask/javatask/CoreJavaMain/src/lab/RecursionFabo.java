package lab;

public class RecursionFabo {

	long fibo(int n) {
		if (n <= 1)
			return 1;
		else
			return (fibo(n - 1) + fibo(n - 2));
	}

	public static void main(String[] args) {
		RecursionFabo f;
		long l;
		f = new RecursionFabo();
		l = f.fibo(5);
		System.out.println("5th Fibonacci number is : " + l);

	}

}
