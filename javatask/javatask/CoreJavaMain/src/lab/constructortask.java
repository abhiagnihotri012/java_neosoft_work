package lab;

public class constructortask {
	
	int stid;
	String name;
	String course;
	int marks;
	 public constructortask(int i,String name1,String course1,int marks1){
		this.stid=i;
		this.name=name1;
		this.course=course1;
		this.marks=marks1;
	}
	
	public void show(){
		System.out.println("Stid="+stid+"  name="+name+"  course="+course+"  marks="+marks);
	}

	public static void main(String[] args) {
		constructortask a=new constructortask(111,"Vinay","IT",75);
		a.show();
	
		
	}

}
