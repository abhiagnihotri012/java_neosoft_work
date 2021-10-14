package lab;

public class Operator {
	
	int a=10;
	int b=a++ - a++ + a;
	int d=12,c=~d;
	int add=a+b;
	int sub=a-b;
	boolean e=a>b;
	int bit_and=12&5;
	int bit_or=12|5;
	int bit_xor=12^5;
	int bit_left=12>>1;
	int bit_right=12<<1;
	int f=10,g=5;
	int conditional=f++ < --g ? f+g :f*g;
	
	public static void main(String[] args) {
		Operator obj=new Operator();
	
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.add);
		System.out.println(obj.sub);
		System.out.println(obj.e);
		System.out.println(obj.bit_and);
		System.out.println(obj.bit_or);
		System.out.println(obj.bit_xor);
		System.out.println(obj.bit_left);
		System.out.println(obj.bit_right);
		System.out.println(obj.conditional);
	}

}
