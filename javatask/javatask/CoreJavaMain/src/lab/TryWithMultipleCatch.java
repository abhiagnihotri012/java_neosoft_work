package lab;
import java.util.Scanner;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a/b;
			System.out.println(c);
			int arr[]=new int[3];
			System.out.println(arr[4]);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException b){
			System.out.println(b);
			
		}
		

	}

}
