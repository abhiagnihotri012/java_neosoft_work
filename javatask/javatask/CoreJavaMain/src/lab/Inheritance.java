package lab;
class ParentClass{
	int x=10;
	int y=20;
	void show() {
		System.out.println("parent A");
	}
}


public class Inheritance extends A {

	public static void main(String[] args) {
		Inheritance c=new Inheritance();
		ParentClass a=new ParentClass();
        System.out.println(a.x);	
        a.show();
        System.out.println(a.y);


	}

}





