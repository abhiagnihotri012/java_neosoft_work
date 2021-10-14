package lab;

public class CallByReference {
	
	int i,j;
	public CallByReference(int a,int b) {
		i=a;
		j=b;
	}
	
	public void show(CallByReference n) {
		n.i *= 2;
		System.out.println(n.i);
		n.j += 2;
		System.out.println(n.j);
	}

	public static void main(String[] args) {
		CallByReference obj=new CallByReference(10,20);
		obj.show(obj);

	}

}
