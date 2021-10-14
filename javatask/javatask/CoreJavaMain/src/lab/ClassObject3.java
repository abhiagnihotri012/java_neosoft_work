package lab;

public class ClassObject3 {
	
	 int roomNo; 
	 String roomType; 
	 float roomArea; 
	 boolean acMachine; 
	 /**
	 * 
	 */
	public void setdata(int rn,String rmtype,float rmarea,boolean ac) {
		 roomNo=rn;
		 roomType=rmtype;
		 roomArea=rmarea;
		 acMachine=ac;
	 }
	
	public void displaydata() {
		System.out.println("Room no is : "+roomNo);
		System.out.println("Room type is: "+roomType);
		System.out.println("Room area is: "+roomArea);
		String ac=(acMachine)?"yes":"No";
		System.out.println("Ac is needed: "+ac);
	}

	public static void main(String[] args) {
		ClassObject3 a=new ClassObject3();
		a.setdata(101,"Delux",2.2f,true);
		a.displaydata();
		

	}

}
