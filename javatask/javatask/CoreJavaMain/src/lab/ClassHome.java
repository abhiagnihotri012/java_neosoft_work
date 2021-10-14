package lab;

public class ClassHome {
	
	ClassObject3 r;
	 void creation() {
		 r=new ClassObject3();
	 }
	 void displayHome() {
		 r.displaydata();
	 }

	public static void main(String[] args) {
		ClassHome a=new ClassHome();
		a.creation();
		a.displayHome();
	}

}
