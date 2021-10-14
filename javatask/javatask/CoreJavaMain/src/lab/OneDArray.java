package lab;
import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int add=0;
		for(int i:arr) {
			add += i;
		}
		System.out.println(add+" =");

	}

}
