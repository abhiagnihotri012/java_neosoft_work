package lab;
import java.util.Scanner;

public class TryCatchEx {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			int size=s.nextInt();
			int arr[]=new int[size];
		}catch(Exception e) {
			System.out.println("exception occured "+e);
		}
		System.out.println("After try catch");
	}

}
