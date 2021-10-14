package lab;

public class atrixMultiplication {

	public static void main(String[] args) {
		 int a[][]={ {0,1,4},{2,1,7} }; 
		 int b[][]={ { 1,7,2,3},{4,1,-2,3},{4,1,7,2} }; 
		 int c[][]; 
		 c = new int[2][4]; 
		 int I, j, k; 
		 for(I=0;I<2;I++) 
		    for(j=0;j<4;j++) 
		    { 
		     c[I][j]=0; 
		        for(k=0;k<3;k++) 
		         c[I][j]+=a[I][k]*b[k][j]; 
		    } 
		 
		    for(I=0;I<2;I++) 
		    { 
		         System.out.println("\n"); 
		         for(j=0;j<4;j++) 
		             System.out.print(c[I][j]+" "); 
		     } 

	}

}
