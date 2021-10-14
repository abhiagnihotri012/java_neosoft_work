package lab;

 abstract class Shape {
	 public abstract void draw();
	 public abstract void erase();
	 
	 public static void main(String[] args) {
		 Shape s;
		 s=new Circle();
		 s.draw();
		 s.erase();
		 
		 s=new Rectangle();
		 s.draw();
		 s.erase();
		 
		 s=new Triangle();
		 s.draw();
		 s.erase();
		 
	 }
     
}
 
 class Circle extends Shape{
	 public void draw() {
		 System.out.println("Draw circle");
	 }
	 public void erase() {
		 System.out.println("Erase Circle");
	 }
 }
 
 class Rectangle extends Shape{
	 public void draw() {
		 System.out.println("Draw Rectangle");
	 }
	 public void erase() {
		 System.out.println("Erase Rectangle");
	 }
 }
 
 class Triangle extends Shape{
	 public void draw() {
		 System.out.println("Draw Triangle");
	 }
	 public void erase() {
		 System.out.println("Erase Triangle");
	 }
 }
