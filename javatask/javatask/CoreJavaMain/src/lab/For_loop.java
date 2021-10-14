package lab;
import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		System.out.println("Enter a number that u are print a table");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=10;i++) {
			int table=n*i;
			System.out.println(table+" ");
		}

	}

}
