package lab;
import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		while(n>0) {
			int m=n%10;
			sum=sum+m;
			n=n/10;
		}
		System.out.println(sum);

	}

}
