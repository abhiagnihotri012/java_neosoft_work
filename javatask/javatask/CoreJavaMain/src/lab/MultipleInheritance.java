package lab;



public class MultipleInheritance {

	public static void main(String[] args) {
		Tyre tyre = new Tyre();
		System.out.println(tyre.isMovable());
		System.out.println(tyre.isRollable());		
		tyre.move();

	}

}

interface Moveable{
	int AVERAGE_SPEED = 50; //auto public, final, static
	void move(); //auto public and abstract
	boolean isMovable();
}

interface Rollable { //extends Moveable{
	boolean isRollable();
}

class Tyre extends MultipleInheritance implements Moveable, Rollable{ //Multiple inheritance

	@Override
	public boolean isRollable() {		
		return true;
	}

	@Override
	public void move() {
		System.out.println("Avg Speed: "+AVERAGE_SPEED);
	}

	@Override
	public boolean isMovable() {
		return true;
	}
	
}
