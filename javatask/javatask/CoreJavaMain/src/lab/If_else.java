package lab;
import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=s.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}

	}

}
