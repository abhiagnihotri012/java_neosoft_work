package lab;

public class twoDArray {

	public static void main(String[] args) {
		int []arr[]={{1,2,3},{2,3,4}};
		int m=0;
		for(int i[] : arr) {
			int s=0;
			for(int j:i) {
				s += j;
			}
			m += s;
		}
		System.out.println(m);

	}

}
