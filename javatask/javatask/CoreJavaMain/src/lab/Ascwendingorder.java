package lab;
import java.util.Arrays;
import java.util.Scanner;

public class Ascwendingorder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}

	}

}
