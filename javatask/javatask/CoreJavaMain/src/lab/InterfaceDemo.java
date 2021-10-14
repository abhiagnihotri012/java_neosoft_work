package lab;

interface ExtendDemo {

	public void meth1();
	public void meth2();

}

class Myclass implements ExtendDemo{

	@Override
	public void meth1() {
		System.out.println("method 1");
		
	}

	@Override
	public void meth2() {
		System.out.println("method 2");
		
	}
	
}
class InterfaceDemo{
	public static void main(String[] args) {
		Myclass a=new Myclass();
		a.meth1();
		a.meth2();
	}
}
