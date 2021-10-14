package lab;

public class MatrixAddition {

	public static void main(String[] args) {
		int a[][]={ {4,7,9,8,3},{2,4,7,8,1},{1,1,8,1,2},{0,0,1,0,4}}; 
		int b[][]={ {1,2,8,4,3},{4,1,8,3,1},{2,1,0,0,5},{1,2,1,1,7}}; 
		int c[][]; 
		c = new int[4][5];
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0;i<4;i++) {
			System.out.println("\n");
			for(int j=0;j<5;j++) {
				System.out.print(c[i][j]+"  ");
			}
		}

	}

}
