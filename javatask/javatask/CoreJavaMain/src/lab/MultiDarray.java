package lab;

public class MultiDarray {

	public static void main(String[] args) {
		int []arr[][]={{{1,2,3},{2,3,4}},{{1,2,3},{2,3,4}}};
		int m=0;
		for(int i[][] : arr) {
			int s=0;
			for(int j[]:i) {
				int p=0;
				for(int k:j) {
					p += k;
				}
				s += p;
			}
			m += s;
			
		}
		System.out.println(m);

	}

}
