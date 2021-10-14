package lab;
import java.util.Scanner;

public class Checktwostring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter a first String");
		s1=s.nextLine();
		System.out.println("Enter a Second String");
		s2=s.nextLine();
		if(s1.equals(s2)) {
			System.out.println("String are Equals");
		}else {
			System.out.println("String are not equal");
		}

	}

}
